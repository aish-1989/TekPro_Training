package checknumbers;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
       char ch;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character in lower case");
        ch = sc.nextLine().charAt(0);

        System.out.println("equivalent character in uppercase"+ "\n" + (char)(ch-32));
    }
}
