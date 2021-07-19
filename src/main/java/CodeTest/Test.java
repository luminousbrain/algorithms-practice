package CodeTest;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(list);
        System.out.println(set);

        Collection<Integer> digits = List.of(11, 3, 5, -33, 0);
        Collection<Integer> sortedDigits = digits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedDigits);
    }
}
