
package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateUsingMapAndGroup {

    public static Set<Integer> getDuplicate(List<Integer> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(k -> k.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
