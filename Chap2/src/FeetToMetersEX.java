import java.util.Scanner;

public class FeetToMetersEX {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value for feet:");
        double feet = input.nextDouble();

        double meters = feet * 0.305;

        System.out.print(feet+ " feet is equal to " +meters+ " meters.");


    }
}
