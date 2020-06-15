package prototipe;

public class Sheep implements Animal {
	
	public Sheep()
	{
		System.out.println("Sheep is made");
	}

	@Override
	public Animal makeCopy() {
		// TODO Auto-generated method stub
		System.out.println("Sheep is being made");
		Sheep sheepobj = null;
		
		try 
		{
		  sheepobj = (Sheep) super.clone();
		} catch (CloneNotSupportedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return sheepobj;
	}
	
	@Override
	public String toString()
	{
		return "Dolly is my Hero, beeebee";
	}

}
