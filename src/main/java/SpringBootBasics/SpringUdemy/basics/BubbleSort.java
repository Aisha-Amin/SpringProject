package SpringBootBasics.SpringUdemy.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BubbleSort implements SortAlgo {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
