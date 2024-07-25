public class SecondMinOfArray {

public static void FindSecondMin(int[] A) {
    int first_min = Integer.MAX_VALUE;
    int second_min = Integer.MAX_VALUE;

    for (int i = 0; i < A.length; i++) {

        if (A[i] < first_min) {
            second_min = first_min;
            first_min = A[i];
        } else if (A[i] < second_min) {
            second_min = A[i];
        }
    }

    System.out.println(second_min);
    System.out.println(first_min);
}


    public static void main(String[] args) {
        int A1[] ={12,14,76,10,434};
        FindSecondMin(A1);
    }
}
