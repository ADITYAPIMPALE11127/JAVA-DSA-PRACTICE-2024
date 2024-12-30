import java.util.Scanner;
public class sqaurePattern {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        for(int i = 1; i<= size;i++){
            for(int  j = 1;j<=size;j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
