package prototype;

public class TestCloning {

	public static void main(String[] args)
	{
		CloneFactory animalMaker = new CloneFactory();
		
		Sheep sheep = new Sheep();
		
		Sheep clonedSheep = (Sheep)animalMaker.getClone( sheep );
		
		System.out.println(sheep);
		
		System.out.println(clonedSheep);
		
		System.out.println(System.identityHashCode(System.identityHashCode(sheep)));

		System.out.println(System.identityHashCode(System.identityHashCode(clonedSheep)));
		
		
	}
	
}
