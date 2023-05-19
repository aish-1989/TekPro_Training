package checknumbers;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
       //IsLetterOrDigit
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the value");
            char[] value = sc.nextLine().toCharArray();
            for (char ch1:
                    value ) {
                boolean result = Character.isLetterOrDigit(ch1);
                if(result) {
                    System.out.println("value is alphabet");
                }
                else {
                    System.out.println("value is digit ");
        }

            }
        }while (true);
    }
}
