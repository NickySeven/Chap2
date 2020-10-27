import java.util.Scanner;

public class SumIntegersEX {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");
        int digits = input.nextInt();

        int a = digits % 10;
        int b = (digits / 10) % 10;
        int c = (digits / 100) % 10;

        int sumOfDigits = (a + b + c);

        System.out.println("The sum of digits is equal to " +sumOfDigits);
    }
}
