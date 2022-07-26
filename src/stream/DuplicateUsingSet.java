
package stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateUsingSet {


    public static Set<Integer> getDuplicate(List<Integer> list) {
        Set<Integer> items = new HashSet<>();
        return list.stream().filter(x -> !items.add(x)).collect(Collectors.toSet());
    }

}
