import stream.DuplicateUsingFrequency;
import stream.DuplicateUsingMapAndGroup;
import stream.DuplicateUsingSet;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 3, 2, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 9, 1, 2, 1, 12);

        System.out.println("=====UsingSet=====" + DuplicateUsingSet.getDuplicate(list));

        System.out.println("=====UsingMap=====" + DuplicateUsingMapAndGroup.getDuplicate(list));

        System.out.println("=====UsingMap=====" + DuplicateUsingFrequency.getDuplicate(list));
    }
}