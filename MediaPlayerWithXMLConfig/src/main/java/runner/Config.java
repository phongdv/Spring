package runner;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Services.UserServices;
import Services.abc;
import fpt.edu.entities.UserEntity;

@Configuration
@ImportResource("classpath:config/application-config.xml")
@ComponentScan(basePackageClasses={abc.class,UserServices.class,UserEntity.class})
@EnableJpaRepositories("Services")
@EntityScan("fpt.edu.entities.UserEntity")
public class Config {

	
	/*@Bean
	public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	 
	    dataSource.setDriverClassName("jdbc:postgresql://localhost:5432/testDB");
	    dataSource.setUsername("postgres");
	    dataSource.setPassword("postgres");
	    dataSource.setUrl(
	      "jdbc:mysql://localhost:3306/myDb?createDatabaseIfNotExist=true"); 
	     
	    return dataSource;
	}*/
	
	
}
