import java.util.Scanner;
public class SumofaNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        number = Math.abs(number);
        int sum = 0;
        while(number > 0){
            int LastDigit = number % 10;
            sum = sum +LastDigit;
            number = number / 10;
        }
        System.out.print("The sum of number"+number+" is "+ sum);
    }
}
