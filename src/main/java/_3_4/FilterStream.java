package _3_4;

import java.util.stream.Stream;

public class FilterStream <T extends Number>{
    public Stream<T> filterNegativeNumbers(Stream<T> stream){
        return stream.filter(i -> i.intValue() > 0);
    }
}
