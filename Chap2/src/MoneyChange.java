import java.util.Scanner;

public class MoneyChange {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount as a decimal, e.g. 11.56");
        double amount =input.nextDouble();

        int wholeAmount = (int) (amount * 100);
        int dollars = wholeAmount / 100;

        int remainingCents = wholeAmount % 100;
        int quarters = remainingCents / 25;

        int remainingQuarters = remainingCents % 25;
        int dimes = remainingQuarters / 10;

        int remainingDimes = remainingQuarters % 10;
        int nickels = remainingDimes / 5;

        int pennies = remainingDimes % 5;

        System.out.println("That is " +dollars+ "dollars and " +quarters+ "quarters and " +dimes+ "dimes amd " +nickels+ "nickels and " +pennies+ "pennies.");
    }
}
