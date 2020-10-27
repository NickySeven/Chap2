import java.util.Scanner;

public class PoundsToKilosEX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number in pounds:");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;

        System.out.print(pounds + " pounds is equal to " + kilograms + " kilograms.");

    }
}