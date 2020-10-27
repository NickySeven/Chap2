import java.util.Scanner;

public class AccelerationEX {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter starting velocity in meters/second:");
        double v0 = input.nextDouble();


        System.out.println("Enter ending velocity in meters/second:");
        double v1 = input.nextDouble();


        System.out.println("Enter time span in seconds:");
        double t = input.nextDouble();

        double average = (v1 - v0) / t;

        System.out.println ("The average acceleration is " +average);
    }
}
