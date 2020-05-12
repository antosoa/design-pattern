package factory;

//This is a factory thats only job is creating ships
//By encapsulating ship creation, we only have one
//place to make modifications

public class EnemyFactory{
	
	// This could be used as a static method if we
	// are willing to give up subclassing it
	
	public Enemy makeEnemy(String newType){
		
		//EnemyFactory newEnemy = null;
		
		if (newType.equals("D")){
			
			return new Dragon();
			
		} else 
		
		if (newType.equals("O")){
			
			return new Orc();
			
		} else 
		
		if (newType.equals("W")){
			
			return new EvilWizard();
			
		} else return null;
		
	}
	
}