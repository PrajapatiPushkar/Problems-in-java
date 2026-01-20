package src.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollection {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(-23);
        Utility.print(numList);

        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

        Collections.shuffle(numList);
        Utility.print(numList);
    }
}
