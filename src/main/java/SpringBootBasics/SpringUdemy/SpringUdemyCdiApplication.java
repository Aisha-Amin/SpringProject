package SpringBootBasics.SpringUdemy;

import SpringBootBasics.SpringUdemy.Cdi.CdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringUdemyCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringUdemyCdiApplication.class);


	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringUdemyCdiApplication.class, args);
		CdiBusiness cdiBusiness = applicationContext.getBean(CdiBusiness.class);

		LOGGER.info("{} dao-{}",cdiBusiness,cdiBusiness.getCdiDAO());

	}

}
