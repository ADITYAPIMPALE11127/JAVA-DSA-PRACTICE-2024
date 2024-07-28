import java.util.Scanner;

public class primeNumber {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        // Check if the number is 0
        if (num == 0){
            System.out.println("Not a prime Number");
        return;
        }
        // Check if the number is 1
        if (num == 1) {
            System.out.print("Not a prime number");
            return;  // Exit the program early
        }

        int temp = 0;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                temp = temp + 1;
            }
        }

        if (temp > 0) {
            System.out.print("Not a prime number");
        } else {
            System.out.print(num + " is a Prime Number");
        }
    }
}
