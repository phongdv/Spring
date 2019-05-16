package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringBasic.ITEmployee;
import javaconfig.Config;

public class javaConfigRun {
public static void main(String[] args) {
	ApplicationContext  context = new AnnotationConfigApplicationContext(Config.class);
 	ITEmployee iter=  context.getBean(ITEmployee.class);
 	iter.resolveTask();
}
}
