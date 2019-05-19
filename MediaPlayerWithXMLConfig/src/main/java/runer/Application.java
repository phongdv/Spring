package runer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Services.UserServices;
import Services.abc;

@SpringBootApplication
@ComponentScan(basePackageClasses={abc.class,UserServices.class})
@EnableJpaRepositories("Services")
@EntityScan("fpt.edu.entities")
public class Application {
	@Autowired
	private abc repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		UserServices services = context.getBean(UserServices.class);
	//	services.createNewUser(new UserEntity("Phong", "123"));
		context.getBean(abc.class);
		
		
		
	}

}
