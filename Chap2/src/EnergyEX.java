import java.util.Scanner;

public class EnergyEX {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of water:");
        double M = input.nextDouble();


        System.out.println("Enter initial temperature:");
        double initialTemperature = input.nextDouble();


        System.out.println("Enter final temperature:");
        double finalTemperature = input.nextDouble();

        double Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.println ("The energy needed is " +Q);
    }
}
