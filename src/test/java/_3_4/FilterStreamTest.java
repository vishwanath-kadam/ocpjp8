package _3_4;

import _3_4.FilterStream;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FilterStreamTest {

    @Test
    void filterNegativeNumbers() {
        Stream<Integer> stream = Stream.of(0, -1, 1, -2, 2);
        FilterStream<Integer> filterStream = new FilterStream<>();
        Stream<Integer> positiveNumbers = filterStream.filterNegativeNumbers(stream);
        //positiveNumbers.forEach(i-> System.out.println(i));
        assertEquals(2, positiveNumbers.count());
    }
}