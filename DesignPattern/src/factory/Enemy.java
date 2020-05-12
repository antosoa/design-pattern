package factory;

abstract class Enemy {

	private String name;
	private double speed;
	private double amtDamage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getAmtDamage() {
		return amtDamage;
	}
	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
	
	public void followHero() {
		
		System.out.println(getName() + " is following the hero");
		
	}
   public void displayEnemy() {
		
		System.out.println(getName() + " is on the screen");
		
	}
   public void attackHero() {
	
	System.out.println(getName() + " attacks the hero and does " + getAmtDamage());

}
	
	
}
