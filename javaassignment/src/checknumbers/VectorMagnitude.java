package checknumbers;

import java.util.Vector;

//write a method in a vector class that calculates and returns the magnitude(length) of  a vector< the magnitude
// of a vector can be calculated by taking the square root of the sum of squares of its elements
//
public class VectorMagnitude {
    public static void main(String[] args) {
        double a=2,b=3,c=4;
        getVectorMagnitude(a, b , c);
    }

    static void getVectorMagnitude(double a, double b, double c){
        double total = (a*a) + (b*b) + (c*c);
        System.out.println("Vector Magnitude:"+ Math.sqrt(total));
    }
}
