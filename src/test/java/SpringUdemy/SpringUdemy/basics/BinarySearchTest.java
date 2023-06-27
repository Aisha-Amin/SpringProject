package SpringUdemy.SpringUdemy.basics;

import SpringBootBasics.SpringUdemy.basics.BinarySearch;
import SpringBootBasics.SpringUdemy.basics.SortAlgo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BinarySearchTest {

    @Mock
    private SortAlgo sortAlgo;

   @InjectMocks
    private BinarySearch binarySearch;

    @Test
    public void testBasicScenario() {
        // Define the test data
        int[] numbers = {2, 5, 8, 12, 16};
        int numberToSearchFor = 8;
        // Call the method under test
        int result = binarySearch.binarySearch(numbers, numberToSearchFor);
        // Verify the result
        assertEquals(3, result);
    }

}
