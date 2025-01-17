// Palindrome
// Displays the string in reverse and checks if reversed and original Strings are equal
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String original  = input.nextLine();
        String reversed = "";
        for(int i = original.length() - 1; i >= 0; i--){
            reversed = reversed + original.charAt(i);

        }
        System.out.println("The reversed string: "+reversed);

        if(original.equals(reversed)){
            System.out.print("String is a Palindrome");
        }
        else{
            System.out.print("String is not a Palindrome");
        }
    }
}
