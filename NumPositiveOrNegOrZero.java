import java.util.Scanner;
public class NumPositiveOrNegOrZero {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        float num = input.nextFloat();

        if(num == 0){
            System.out.println("Num is ZERO");
        }
        else if(num > 0){
            System.out.println("Num is Positive");
        }
        else if(num < 0 ){
            System.out.println("Num is Negative");
        }
    }
}
