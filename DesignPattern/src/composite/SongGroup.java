package composite;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *Composite – The composite class defines a concrete component class, 
 *which stores its child components. The composite class implements the component interface. 
 *It forwards the command/task to the composite 
 *objects it contains. It may also perform additional operations before and after forwarding the command/task. 
 * 
 */

public class SongGroup extends SongComponent{

	
	ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();
	
	String groupName;
	String groupDescription;
	
	public SongGroup( String newGroupName,  String newGroupDescription)
	{
		this.groupName = newGroupName;
		this.groupDescription = newGroupDescription;
	}
	
	public String getGroupName() 
	{
		return this.groupName;
	}
	
	public String getGroupDescription() 
	{
		return this.groupDescription;
	}
	
	public void add(SongComponent newSongComponent)
	{
		songComponents.add( newSongComponent );
	}
	
	//remove method of type remove(Object)
	
	public void remove(SongComponent newSongComponent)
	{
		songComponents.remove( newSongComponent );
	}
	
	//remove method of type remove(int index)
	
	public SongComponent getSongComponent(int componentIndex)
	{
		return (SongComponent) songComponents.get( componentIndex );
	}
	
	public void displaySongInfo()
	{
		System.out.println(getGroupName() + " " +
	    getGroupDescription() + "\n");
	 
		Iterator<SongComponent> it = songComponents.iterator();
		
		while(it.hasNext())
		{
			SongComponent songInfo = (SongComponent) it.next();
			songInfo.displaySongInfo();
			
		}
	}
}
