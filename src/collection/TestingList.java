package src.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Pushkar\t");
        strList.add("Prajapati");
        //strList.add(654);


        strList.add(1, "PK\t");
        strList.remove(0);

        if (strList.contains("Prajapati")) {
            System.out.println(strList.indexOf("Prajapati"));
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }


    }
}
