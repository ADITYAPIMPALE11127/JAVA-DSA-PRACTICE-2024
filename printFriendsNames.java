import java.util.Scanner;
public class printFriendsNames {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter names: ");
        String name1 = input.next();
        String name2 = input.next();
        String name3 = input.next();
        System.out.print("Hi" +" "+ name3 +" " + name2+" " +"and"+" " + name1);
    }
}
