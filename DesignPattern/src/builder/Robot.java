package builder;

public class Robot implements RobotPlan{
	
	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	

	public String getHead() { return this.robotHead;}
	
	public String getTorso() { return this.robotTorso;}
	
	public String getArms() { return this.robotArms;}
	
	public String getLegs() { return this.robotLegs;}
	
	@Override
	public String toString()
	{
		return "la testa: " + getHead() + " le braccia: " + getArms() +
				" le gambe: " + getLegs() + " il torso: " + getTorso();
	}
	
	@Override
	public void setRobotHead(String head) {
		// TODO Auto-generated method stub
		this.robotHead = head;
	}

	@Override
	public void setRobotTorso(String torso) {
		// TODO Auto-generated method stub
		this.robotTorso = torso;
	}

	@Override
	public void setRobotArms(String arms) {
		// TODO Auto-generated method stub
		this.robotArms = arms;
	}

	@Override
	public void setRobotLegs(String legs) {
		// TODO Auto-generated method stub
		this.robotLegs = legs;
	}

}
