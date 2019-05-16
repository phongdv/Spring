package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import SpringBasic.Employee;
import SpringBasic.FixPrinterTask;
import SpringBasic.FixTV;
import SpringBasic.ITEmployee;
import SpringBasic.Task;

@Configuration
public class Config {

	
@Bean
public Employee createEmployee(){
	return new ITEmployee(cratefixPrinter());
}

@Bean
public Task crateTask(){
return new FixTV();
}

@Bean
public Task cratefixPrinter(){
return new FixPrinterTask();
}
	
	
	
}
