package checknumbers;

public class EvenNumbers {
    public static void main(String[] args) {
        //print even numbers between 23 and 57,each number should be printed in separate row
        for(int i = 23;i<=57;i++){
            if(i%2==0){
                System.out.println("\t"+i);
            }
        }
    }
}
