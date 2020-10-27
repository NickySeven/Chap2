import java.util.Scanner;

public class FinancialEX {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter subtotal:");
        double subtotal = input.nextDouble();

        System.out.println("Enter gratuity rate:");
        double gratuityRate = input.nextDouble();

        double gratuity = gratuityRate / 10;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is " +gratuity+ " and the total is " +total);
    }
}
