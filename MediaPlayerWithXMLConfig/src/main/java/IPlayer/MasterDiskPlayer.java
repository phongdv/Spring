package IPlayer;

import java.util.Iterator;
import java.util.List;

public class MasterDiskPlayer {

	
	
	
	public List<Disk> getListOfDisk() {
		return listOfDisk;
	}



	public void setListOfDisk(List<Disk> listOfDisk) {
		this.listOfDisk = listOfDisk;
	}



	private List <Disk> listOfDisk;
	
	
	
	public MasterDiskPlayer(List<Disk> listOfDisk) {
		super();
		this.listOfDisk = listOfDisk;
	}



	public MasterDiskPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void play(){
		for (Disk disk : listOfDisk) {
			disk.play();
		}
		
		
	}
	
	
	
	
	
}
