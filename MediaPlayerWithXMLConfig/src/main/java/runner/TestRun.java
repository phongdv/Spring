package runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import IPlayer.MasterDiskPlayer;

public class TestRun {

	public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/application-config.xml");
			MasterDiskPlayer player = (MasterDiskPlayer) context.getBean(MasterDiskPlayer.class);
			player.play();
		
		
	}
	
	
	
}
