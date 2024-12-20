import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    public static boolean Anagram(String str1,String str2){
       if(str1.length() != str2.length()){
           return false;
       }
       char charArr1[] = str1.toCharArray();
        char charArr2[] = str1.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1,charArr2);
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the string 1 : ");
        String str1 = input.nextLine();
        System.out.print("enter the string 2 : ");
        String str2 = input.nextLine();

        if(Anagram(str1,str2)){
            System.out.print("it is a anagram.");
        }
        else{
            System.out.print("it is not");
        }
    }
}
