import java.util.Scanner;

public class HexagonEX {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of side:");
        double s = input.nextDouble();

        double area = (((3 * (Math.pow(3 , 0.5))) / 2) * (Math.pow(s,2)));
        System.out.println("The area of the hexagon is " + area);

    }
}
