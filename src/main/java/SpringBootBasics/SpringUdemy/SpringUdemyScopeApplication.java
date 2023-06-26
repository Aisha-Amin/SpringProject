package SpringBootBasics.SpringUdemy;

import SpringBootBasics.SpringUdemy.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringUdemyScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringUdemyScopeApplication.class);


	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringUdemyScopeApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());

		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());

	}

}
