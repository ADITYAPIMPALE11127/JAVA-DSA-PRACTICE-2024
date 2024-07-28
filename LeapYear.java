// divisible by 400
// divisible by 4 but not by 100
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the year: ");
        int year = input.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println("Not a leap year");
        }
    }
}