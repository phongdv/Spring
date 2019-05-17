package config.sib;

import org.springframework.stereotype.Component;

import IPlayer.Disk;
@Component
public class DongNhi implements Disk {

	@Override
	public void play() {
		System.out.println("Dong nhi boi roi khong tin");
		
	}

}
