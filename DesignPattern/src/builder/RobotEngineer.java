package builder;

/**
 * 
 * @author antonio
 * 
 * this class will create a new Robot using the builder interface
 *
 */

public class RobotEngineer {

	private RobotBuilderInterface robotBuilder;
	
	public RobotEngineer(RobotBuilderInterface robotBuilderInterface)
	{
		this.setRobotBuilder(robotBuilderInterface);
	}
    
	public Robot getRobot()
	{
		return getRobotBuilder().getRobot();
	}
	
	public RobotBuilderInterface getRobotBuilder() {
		return robotBuilder;
	}

	public void setRobotBuilder(RobotBuilderInterface robotBuilder) {
		this.robotBuilder = robotBuilder;
	}
	
	public void makeABot()
	{
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
		this.robotBuilder.buildRobotTorso();
		
	}
	
}
