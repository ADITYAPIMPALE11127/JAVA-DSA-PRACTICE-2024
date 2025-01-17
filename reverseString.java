// Displays the string in reverse
import java.util.Scanner;
public class reverseString {
    public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the String: ");
       String original  = input.nextLine();
       String reversed = "";
       for(int i = original.length() - 1; i >= 0; i--){
           reversed = reversed + original.charAt(i);

       }
       System.out.print("The reversed string:"+reversed);
    }
}
