
package stream;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateUsingFrequency {

    public static Set<Integer> getDuplicate(List<Integer> list) {

        return list.stream()
                .filter(x -> Collections.frequency(list, x) > 1)
                .collect(Collectors.toSet());
    }

}
