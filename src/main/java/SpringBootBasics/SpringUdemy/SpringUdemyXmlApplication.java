package SpringBootBasics.SpringUdemy;

import SpringBootBasics.SpringUdemy.Xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUdemyXmlApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringUdemyXmlApplication.class);


	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
			// [xmlJdbcConnection, xmlPersonDAO]
			// Above 2 beans are loaded

			LOGGER.info("{}",xmlPersonDAO);
			LOGGER.info("{}",xmlPersonDAO.getXmlJdbcConnection());
		}
	}

}
