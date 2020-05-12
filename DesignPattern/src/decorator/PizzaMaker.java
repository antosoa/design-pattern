package decorator;

public class PizzaMaker {

	public static void main(String[] args) {
	
		Pizza margheritaPizza = new Mozzarella(new TomatoSauce(new PlainPizza()));
		
		System.out.println("Ingredientrs: " + margheritaPizza.getDescription());

		System.out.println("Ingredientrs: " + margheritaPizza.getCost());

		
	}

}
