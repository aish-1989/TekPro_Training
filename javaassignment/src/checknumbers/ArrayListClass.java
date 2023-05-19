package checknumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(123);
        integerList.add(2560);
        integerList.add(236);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
        Collections.reverse(integerList);
        System.out.println(integerList);
        }
    }

