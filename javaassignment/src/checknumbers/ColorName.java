package checknumbers;

import java.util.Scanner;

public class ColorName {
    //print color name based on color code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValid=false;
        do{
        System.out.println("enter the character");

        char ch = sc.nextLine().charAt(0);
        switch (ch) {
            case 'R':
                System.out.println(ch + "->Red");
                isValid=true;
                break;
            case 'B':
                System.out.println(ch + "->Blue");
                isValid=true;
                break;
            case 'G':
                System.out.println(ch + "->Green");
                isValid=true;
                break;
            case 'O':
                System.out.println(ch + "->orange");
                isValid=true;
                break;
            case 'Y':
                System.out.println(ch + "->Yellow");
                isValid=true;
                break;
            default:
                System.out.println("invalid");
                isValid=false;
                break;
        }
        }while (isValid);
    }
}
