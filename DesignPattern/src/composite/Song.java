package composite;

/*
 * Leaf – The leaf class defines a concrete component class, 
 * which does not have any further composition. The leaf 
 * class implements the component interface. 
 * It performs the command/task at its end only.
 * 
 */

public class Song extends SongComponent{
	
	String songName;
	String bandName;
	int releaseYear;
	
	public Song(String newSongName, String newBandName, int newYearReleased)
	{
		
		this.songName = newSongName; 
		this.bandName = newBandName;
		this.releaseYear = newYearReleased;
		
	}
	
	public String getSongName() { return songName; }
	public String getBandName() { return bandName; }
	public int getReleaseYear() { return releaseYear; }
   
	@Override
	public void displaySongInfo()
	{
		System.out.println( getSongName() +  " was recorded by "
				+ getBandName() + " in " + getReleaseYear());
	}
}
