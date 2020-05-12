package decorator;

public class PlainPizza implements Pizza {;
	
	public PlainPizza(){
	
	System.out.println("Adding Pasta");
	
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Thin pasta";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		System.out.println("Cost of pasta: " + 5.00);
		return 5.00;
	}
 
	
}
