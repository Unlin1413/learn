package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionLearn {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> integers2 = new ArrayList<>();
        integers.add(2);
        integers.remove(0);
        integers.get(0);
        integers.addAll(integers2);
        integers.contains(2);
        boolean empty = integers.isEmpty();
        integers.set(0, 2);

    }
}
