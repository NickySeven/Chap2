import java.util.Scanner;

public class VolCylinderEX {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = input.nextDouble();

        System.out.println("Enter length:");
        double length = input.nextDouble();

        double area = radius * radius * 3.14159;
        double volume = area * length;

        System.out.println("The area is " +area);
        System.out.println("The volume is " +volume);
    }
}
