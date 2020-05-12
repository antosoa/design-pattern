package singleton;

public class ScrabbleThreadTest {

	public static void main(String[] agrs) {
		
		Runnable getTiles = new GetTheTiles();
		
		Runnable getTilesAgain = new GetTheTiles();
		
		Runnable getTilesAgain2 = new GetTheTiles();
		 											//Runnable interface create a new Thread
	    new Thread(getTiles).start();
	    new Thread(getTilesAgain).start();
	    new Thread(getTilesAgain2).start();
	}
	
}
