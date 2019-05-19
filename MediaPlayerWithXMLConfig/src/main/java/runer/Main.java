package runer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Services.UserServices;
import Services.abc;
import runner.Config;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		UserServices services = context.getBean(UserServices.class);
	//	services.createNewUser(new UserEntity("Phong", "123"));
		context.getBean(abc.class);
	}
}
