import java.util.Scanner;

public class CelsiusToFarEX {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0/5.0) * celsius + 32;
        System.out.println("which equals to " +fahrenheit+ "fahrenheit");
    }
}
