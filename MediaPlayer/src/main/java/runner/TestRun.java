package runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import IPlayer.Disk;
import config.CdPlayerConfig;
import config.MyTamDisk;
import config.sib.DongNhi;

public class TestRun {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CdPlayerConfig.class);
//		Disk d = (Disk) context.getBean(MyTamDisk.class); ok should use this because if you change name it will raise eror
//		Disk d = (Disk) context.getBean("myTamDisk"); ok
		Disk d = (Disk) context.getBean("theBesDiskOfMyTam");
		Disk dongnhi = (Disk) context.getBean(DongNhi.class);
		d.play();
		dongnhi.play();
		
		
		
		
	}
	
	
	
}
