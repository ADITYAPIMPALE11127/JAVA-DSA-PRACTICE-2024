import java.util.Scanner;
public class ifelsePrint {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        if(num % 5 == 0 && num % 3 == 0){
            System.out.print("Hello World");
        }else if(num % 3 == 0){
            System.out.print("Hello");
        }else if(num % 5 == 0){
            System.out.print("World");
        }else{
            System.out.print("Not divisible by 3 or 5 ");
        }
    }
}