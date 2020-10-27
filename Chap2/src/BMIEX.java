import java.util.Scanner;

public class BMIEX {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double pounds = input.nextDouble();

        System.out.println("Enter height in inches:");
        double inches = input.nextDouble();

        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double meters2 = Math.pow(meters,2);

        double BMI = (kilograms / meters2);

        System.out.println ("BMI is " +BMI);
    }
}
