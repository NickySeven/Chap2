import java.util.Scanner;

public class InterestEX {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance and interest rate:");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double interest = balance * (interestRate/1200);

        System.out.println ("The interest is " +interest);
    }
}
