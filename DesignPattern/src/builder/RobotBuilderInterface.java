package builder;

/**
 * 
 * @author antonio
 *
 *Interface for building all the different type of Robot 
 *Object we need
 *
 */

public interface RobotBuilderInterface {
	
	public void buildRobotHead();
	
	public void buildRobotTorso();
	
	public void buildRobotArms();
	
	public void buildRobotLegs();
	
	public Robot getRobot();
	

}
