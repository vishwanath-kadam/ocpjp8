package _3_4;

import _3_4.FilterCollection;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class FilterCollectionTest {

    @Test
    void filter() {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);

        FilterCollection<Integer> filterCollection = new FilterCollection();
        Collection<Integer> filteredCollection = filterCollection.filterOddNumbers(collection);

        for (Integer i : filteredCollection)
            System.out.println(i);

        assertEquals(2, filteredCollection.size());

    }
}