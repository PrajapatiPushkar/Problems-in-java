package src.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Pushkar"));
        System.out.println(names.add("Prajapati"));
        System.out.println(names.add("PKP"));
        Utility.print(names);

        System.out.println(names.add("Pushkar"));
        System.out.println(names.size());
        Utility.print(names);
    }
}
