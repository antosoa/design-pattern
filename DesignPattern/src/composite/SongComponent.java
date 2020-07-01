package composite;

/*
 * Component – Component is the interface (or abstract class) 
 * for the composition of the 
 * objects and methods for accessing/processing 
 * its child or node components. 
 * It also implements a default interface to define common 
 * functionalities/behaviors for all component classes.
 * 
 */

public abstract class SongComponent {
	
	public void add( SongComponent newSongComponent )
	{
		throw new UnsupportedOperationException();
	}

	public void remove( SongComponent newSongComponent )
	{
		throw new UnsupportedOperationException();
	}
	 
	public SongComponent getComponent(int componentIndex)
	{
		throw new UnsupportedOperationException();
	}
	
	public String getSongName()
	{
		throw new UnsupportedOperationException();
	}
	
	public String getBandName()
	{
		throw new UnsupportedOperationException();
	}
	
	public int getReleaseYear()
	{
		throw new UnsupportedOperationException();
	}
	
	public void displaySongInfo()
	{
		throw new UnsupportedOperationException();
	}
	
}
