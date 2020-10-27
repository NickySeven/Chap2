import java.util.Scanner;

public class OtherTimesEXWrong {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the timezone offset to GMT:");
        int zone = input.nextInt();

        System.out.println(System.currentTimeMillis() - zone);
    }
}
