package _3_4;

import java.util.Collection;
import java.util.function.Predicate;

public class FilterCollection<T extends Number>{
    public Collection<T> filterOddNumbers(Collection<T> collection){

        collection.removeIf(new Predicate<T>() {
            @Override
            public boolean test(T t){
                return t.intValue() % 2 != 0;
            }
        });

        return collection;
    }
}
