package SpringBootBasics.SpringUdemy.basics;

import org.springframework.stereotype.Service;

@Service
public class QuickSort implements SortAlgo{
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
