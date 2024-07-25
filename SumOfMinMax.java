

public class SumOfMinMax {

    public static int findSumOfMinMax(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {

            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }
        return max + min;
    }

    public static void main(String[] args) {
        int A1[] = {1,2,3,-1,5};
        int A2[] = {-2,-1,3,2,1};

        System.out.println("Output 1: " + findSumOfMinMax(A1));
        System.out.println("Output 2: " + findSumOfMinMax(A2));
    }
}