package checknumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//reverse the order of its elements
public class ReverseOrder {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(12);
        number.add(10);
        number.add(66);
        number.add(8);
        number.add(9);
        number.add(11);
        for (int val:number
             ) {
            System.out.println(val);
        }
//        Collections.sort(number);
//        System.out.println("sorting numbers:"+number);
        Collections.reverse(number);
        System.out.println("Reverse numbers after sorting :"+number);
    }
}
