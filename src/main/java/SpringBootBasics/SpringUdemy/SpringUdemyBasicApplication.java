package SpringBootBasics.SpringUdemy;

import SpringBootBasics.SpringUdemy.basics.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringUdemyBasicApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringUdemyBasicApplication.class, args);
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[]{1,15,4},3);
		System.out.println(result);
	}

}
