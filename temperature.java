import java.util.Scanner;

public class temperature {


    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter the celcius: ");
        int c = input.nextInt();
        int convf  = (c * 9 / 5  ) + 32;
        System.out.println(c+" C is  "+convf+ "F");

        System.out.print("enter the farhenhiet: ");
        int f = input.nextInt();
        int convc = (f - 32) * 5 / 9;
        System.out.println(f+" F is "+convc + "C");



    }
}