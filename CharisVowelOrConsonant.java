import java.util.Scanner;
public class CharisVowelOrConsonant {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the character: ");
       char newChar = input.next().charAt(0);

       if(newChar == 'A' || newChar == 'E' || newChar == 'I' || newChar == 'O' ||newChar == 'U'||
               newChar == 'a'||newChar == 'e'||newChar == 'i'||newChar == 'o' || newChar == 'u'){
           System.out.println("It is a Vowel");
       }
       else{
           System.out.println("it is a consonant");
       }
    }
}
