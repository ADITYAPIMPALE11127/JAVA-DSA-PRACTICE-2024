import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.print("enter count: ");
int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a +" "+ b);
        for(int i = 1; i <= n; i++ ){

            c = a + b;
             a = b;
             b = c;
            System.out.print(" "+ c);
        }
    }
}