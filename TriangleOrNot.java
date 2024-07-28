import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the degree for Angle A: ");
        int A = input.nextInt();
        System.out.println("Enter the degree for Angle B: ");
        int B = input.nextInt();
        System.out.println("Enter the degree for Angle C: ");
        int C = input.nextInt();

        // Check if the sum of angles is 180
        if (A + B + C != 180 || A <= 0 || B <= 0 || C <= 0) {
            System.out.println("Not a triangle");
        } else {
            // Check if it is a triangle using the angle sum property
            if (A + B > C && A + C > B && B + C > A) {
                // Check for equilateral triangle
                if (A == B && B == C) {
                    System.out.println("It is an Equilateral Triangle");
                } else {
                    System.out.println("It is a Triangle");
                }
            } else {
                System.out.println("Not a triangle");
            }
        }
        
        input.close(); // Close the scanner
    }
}
