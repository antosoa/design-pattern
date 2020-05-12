package decorator;

public class TomatoSauce extends ToppingDecorator {
	
	public TomatoSauce(Pizza newPizza) {
		  
		super(newPizza);
		
		System.out.println("Adding Tomato Sauce");
		
	}
	
   public String getDescription() {
		
		return tempPizza.getDescription() + ", tomato sauce";
		
	}
	
	public double getCost() {
		
		System.out.println("Cost of tomato:" + " .45");
		return tempPizza.getCost() + 0.45;
		
	}

}
