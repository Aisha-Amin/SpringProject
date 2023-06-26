package SpringBootBasics.SpringUdemy;

import SpringBootBasics.Componentscan.ComponentPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("SpringBootBasics")
public class SpringUdemyComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringUdemyComponentApplication.class);


	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringUdemyComponentApplication.class, args);
		ComponentPersonDAO componentPersonDAO = applicationContext.getBean(ComponentPersonDAO.class);
		LOGGER.info("{}",componentPersonDAO);

	}

}
