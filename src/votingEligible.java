import java.util.*;

public class votingEligible {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("enter the  age");

        int age = input.nextInt();

        if( age >= 18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("you are not eligible to vote");
        }
    }

}
