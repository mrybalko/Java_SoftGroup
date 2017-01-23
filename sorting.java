package lesson8.lab4.mycounter;

//method for sorting the list of keys and values
//first change

import java.util.*;
import java.util.stream.Collectors;


//second change
public class sorting {
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
//third change
    }
}
