import java.util.Scanner;

public class RunwayLengthEX {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter speed in meters/second:");
        double v = input.nextDouble();

        System.out.println("Enter airplane's acceleration in meters/second squared:");
        double a = input.nextDouble();

        double length = ((v * v) / (2 * a));

        System.out.println ("The minimum runway length for this airplane is " +length);
    }
}
