import java.util.Scanner;
public class factorial {


    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
    int n = input.nextInt();
    int factorial = 1;

    for(int i = 1; i <= n;i++){

        factorial = factorial * i;

    }
        System.out.println(factorial);
    }
}
