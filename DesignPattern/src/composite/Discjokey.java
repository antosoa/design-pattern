package composite;

public class Discjokey {
   
	SongComponent songList;
	
	public Discjokey( SongComponent newSongList)
	{
		this.songList = newSongList;
 	}
	
	public void getSongList()
	{
		songList.displaySongInfo();
	}
	
}
