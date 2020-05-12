package decorator;

//Inheritance is static while composition is dynamic
//Through composition I'll be able to add new functionality
//by writing new code rather than by changing current code


public interface Pizza {
	
	public String getDescription();
	
	public double getCost();

}
