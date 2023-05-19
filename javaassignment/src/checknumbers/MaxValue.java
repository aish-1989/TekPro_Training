package checknumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> value = new ArrayList<>();
        value.add(12);
        value.add(23);
        value.add(6);
        value.add(56);
        value.add(9);
        value.add(24);
        value.add(99);
        for (int val:value
             ) {
            System.out.println(val);

        }
        System.out.println("print the maximum value:"+ Collections.max(value));
    }
}
