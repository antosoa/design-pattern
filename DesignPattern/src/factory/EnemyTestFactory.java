package factory;

import java.util.Scanner;

public class EnemyTestFactory {

	public static void main(String[] args) {
	

		// Create the factory object
		EnemyFactory enemyFactory = new EnemyFactory();
		
		// Enemy ship object
		
		Enemy  theEnemy = null;
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type of enemy? (D / O / W)");
		
		if (userInput.hasNextLine()){
			
			String typeOfShip = userInput.nextLine();
		
			theEnemy = enemyFactory.makeEnemy(typeOfShip);
			
			if(theEnemy != null){
				
				doStuffEnemy(theEnemy);
				
			} else System.out.print("Please enter D, O, or W next time");
			
		}
			
		}
			// Executes methods of the super class
			
			public static void doStuffEnemy(Enemy anEnemy){
				
				anEnemy.displayEnemy();
				
				anEnemy.followHero();
				
				anEnemy.attackHero();
				
			}
		}
		