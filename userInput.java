import java.util.*;
public class userInput {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // creating an object

        // taking name as input in string data type
        System.out.println("Enter your name");
        String name = input.next();

        // taking gender as input in char data type
        System.out.println("enter gender");
        char gender = input.next().charAt(0);

        // taking age as input in int data type
        System.out.println("Enter age");
        int age = input.nextInt();

        // taking ph number as input in long data type as number is long
        System.out.println("enter ph no: ");
        long number = input.nextLong();

System.out.print(" all good");
    }
}
