package SpringUdemy.SpringUdemy.Xml;

import SpringBootBasics.SpringUdemy.basics.BinarySearch;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class BinarySearchXmlTest {

   @Autowired
   BinarySearch binarySearch;

    @Test
    public void testBasicScenario() {
        // call method on binarySearch
        int actualResult = binarySearch.binarySearch(new int[] {}, 5);

        // check if the value is correct
        assertEquals(3, actualResult);
    }

}
