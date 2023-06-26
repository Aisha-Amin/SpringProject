package SpringBootBasics.SpringUdemy.basics;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SortAlgo sortAlgo;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgo.sort(numbers);
        System.out.println(sortAlgo);
        // Search the array
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("post Construct");
    }

    // this will only be called in singleton scope as spring does not manage the complete lifecycle of a prototype bean:
    // the container instantiates, configures, and otherwise assembles a prototype object,
    // and hands it to the client, with no further record of that prototype instance.
    @PreDestroy
    public void preDestroy(){
        logger.info("pre destroy");
    }
}
