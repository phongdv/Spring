package compactdisk;

import java.util.List;

import IPlayer.Disk;

public class CD implements Disk{

	private String title;
	private String singer;
	private List<String> track;
	
	
	
	
	public CD() {
		super();
	}




	public CD(String title, String singer, List<String> track) {
		super();
		this.title = title;
		this.singer = singer;
		this.track = track;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getSinger() {
		return singer;
	}




	public void setSinger(String singer) {
		this.singer = singer;
	}




	public List<String> getTrack() {
		return track;
	}




	public void setTrack(List<String> track) {
		this.track = track;
	}




	@Override
	public void play() {
		for (String string : track) {
			System.out.println("Track "+title+" is Playing : "+string);
		}
		
	}
	
	
	
}
