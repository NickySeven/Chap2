import java.util.Scanner;

public class InvestmentWrongEX {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount:");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage:");
        double interestRate = input.nextDouble();

        System.out.println("Enter number of years:");
        int years = input.nextInt();

        double futureInvestmentValue = investmentAmount * Math.pow((1 + interestRate),(years*12));
        double value = investmentAmount + futureInvestmentValue;
        System.out.println ("Accumulated value is  " +value);
    }
}
