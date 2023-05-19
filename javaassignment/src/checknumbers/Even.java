package checknumbers;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("enter the number");
            num = sc.nextInt();
            if(num%2==0) {
                System.out.println("number is even");
            }
            else {
                System.out.println("number is odd");
            }
        }while (true);

    }
}
