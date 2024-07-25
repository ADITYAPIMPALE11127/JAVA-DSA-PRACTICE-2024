public class MaxInArray {

    public static int MaxInArray(int A[]){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < A.length; i++){

            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int A1[] = {21,32,1,423,442,643};
        System.out.println("output 1: " + MaxInArray(A1));
    }
}
