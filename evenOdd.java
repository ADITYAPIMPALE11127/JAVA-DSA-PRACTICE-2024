import java.util.*;

public class evenOdd {

    public static void main(String args[]){

        System.out.println("Enter the number: ");
        Scanner input  = new Scanner (System.in);
        int number  = input.nextInt();

        if (number  % 2 == 0){
            System.out.println("Number is even: " + number);
        }
        else{
            System.out.println("Number is odd: " + number);
        }
    }
}