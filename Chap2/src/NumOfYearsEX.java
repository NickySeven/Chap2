import java.util.Scanner;

public class NumOfYearsEX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of minutes:");
        int minutes = input.nextInt();

        int hours = minutes / 60;
        int days = hours/ 24;
        int years = days / 365;
        int reaminingDays = days % 365;

        System.out.println(minutes+ " minutes is approximately " +years+ " years and " +reaminingDays+ " days.");

    }
}