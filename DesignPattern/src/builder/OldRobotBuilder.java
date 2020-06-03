package builder;

/**
 * 
 * @author antonio
 *
 * this class will be used when you need to create a new Robot Object
 * 
 * 
 */

public class OldRobotBuilder implements RobotBuilderInterface{
	
	private Robot robot;

	public OldRobotBuilder()
	{
		this.setRobot(new Robot());
	}
	
	@Override
	public void buildRobotHead() {
		// TODO Auto-generated method stub
		robot.setRobotHead("big Head");
	}

	@Override
	public void buildRobotTorso() {
		// TODO Auto-generated method stub
		robot.setRobotTorso("strong Torso");
	}

	@Override
	public void buildRobotArms() {
		// TODO Auto-generated method stub
		robot.setRobotArms("long arms");
	}

	@Override
	public void buildRobotLegs() {
		// TODO Auto-generated method stub
		robot.setRobotLegs("long legs");
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

}
