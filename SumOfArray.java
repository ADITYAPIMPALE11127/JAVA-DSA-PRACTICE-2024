// Adds all the elements in the array

import java.util.Scanner;
public class SumOfArray{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    int size  = input.nextInt();

    int arr [] = new int[size];
    System.out.println("Enter the array elements: ");
    for(int j = 0 ; j < arr.length; j++){
        arr [j] = input.nextInt();
    }

        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum  =  sum + arr[i];
        }
        System.out.print("The sum of the array is: "+sum);
    }
}