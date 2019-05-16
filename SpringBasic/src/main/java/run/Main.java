package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringBasic.ITEmployee;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
		ITEmployee it=  context.getBean(ITEmployee.class);
		it.resolveTask();
	
		
		
		
	}
	
	
	
}
