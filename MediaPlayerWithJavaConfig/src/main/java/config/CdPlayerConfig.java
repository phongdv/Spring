package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import IPlayer.Diskplayer;
import config.sib.DongNhi;

@Configuration
public class CdPlayerConfig {
	
	@Bean(name="theBesDiskOfMyTam")
	public MyTamDisk getMyTamDisk(){
		return new MyTamDisk();
	}
	@Bean
	public DongNhi getDongNhiDisk(){
		return new DongNhi();
		
	}
	@Bean
	//auto wire without @Autowire
	public Diskplayer getDiskplayer(MyTamDisk dn){
		return new Diskplayer(dn);
		
	}
	
	
	

}
