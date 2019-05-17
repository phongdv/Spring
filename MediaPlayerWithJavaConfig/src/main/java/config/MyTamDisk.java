package config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import IPlayer.Disk;
//@Component() ok
@Component("theBesDiskOfMyTam")
public class MyTamDisk implements Disk{

	
	
	
	public MyTamDisk() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("Hoa my hoa my hot trên bầu trời xanh họa mi long lanh là em đó");
		
	}

}
