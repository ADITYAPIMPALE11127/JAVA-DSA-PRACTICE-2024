import java.util.Scanner;
public class OrOperator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int a = input.nextInt();

        if (a % 3 == 0 || a % 7 == 0){
            System.out.println("number is divisible");
        }
        else{
            System.out.println("number is not divisible");
        }
    }
}
