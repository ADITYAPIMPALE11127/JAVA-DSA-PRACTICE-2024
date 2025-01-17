import java.util.Scanner;
public class ReplaceCharacter {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String original = input.nextLine();
        char target = 'n';
        char replacement = 'm';
        String result ="";
        for(int  i = 0; i < original.length() ;i++){
            char currentChar = original.charAt(i);
            if(currentChar == target){
                result = result + replacement;
            }else{
                result = result + currentChar;
            }
        }
        System.out.print(result);
    }
}
