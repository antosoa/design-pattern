package builder;

public class TestRobotBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 RobotBuilderInterface old = new OldRobotBuilder();	
	 RobotEngineer engine = new RobotEngineer(old);
	 engine.makeABot();
	 
	 System.out.println(engine.getRobot());	 
	 
	}

}
