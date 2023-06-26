package SpringBootBasics;

import SpringBootBasics.SpringUdemy.properties.SomeExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringUdemyPropertiesApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringUdemyPropertiesApplication.class, args);
		SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);

		System.out.println(someExternalService.getServiceUrl());
	}

}
