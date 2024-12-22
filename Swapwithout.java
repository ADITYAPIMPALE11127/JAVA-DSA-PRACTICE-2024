// swaps two numbers without temp variable
import java.util.Scanner;
public class Swapwithout {
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
                System.out.print("Enter the first number: ");
                int b = input.nextInt();

                a = a + b;
                b = a - b;
                a = a - b;

                System.out.print("Swapped both: "+ a +" , "+ b);
    }
}
