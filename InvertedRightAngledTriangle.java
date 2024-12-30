import java.util.Scanner;
public class InvertedRightAngledTriangle {
  public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the size: ");
      int size = input.nextInt();
      for(int i = 1; i <= size; i++){
          for(int  j = i; j <= size;j++){
              System.out.print(" * ");
          }
          System.out.println();
      }
  }
}
