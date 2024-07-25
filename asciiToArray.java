import java.util.Scanner;

public class asciiToArray {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = input.nextLine(); // taking a string as input

        // creating an array same length of input string
        int asciiArray [] = new int [str.length()];

        for(int i = 0; i < str.length(); i++){
// storing each string element at each char into array using for
// loop, also converting the type from string to int
            asciiArray[i] = (int) str.charAt(i);
        }

        System.out.println("ASCII VALUES ARE: ");
        // iterating over each ASCII value stored in ASCII ARRAY
        for(int value :asciiArray ){
            // printing each ASCII element of Array
            System.out.print(value+" ");
        }
    }
}