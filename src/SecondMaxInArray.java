public class SecondMaxInArray{

    public static int[] findMaxInArray(int A[]){

        int first_max  = Integer.MIN_VALUE;
        int second_max  = Integer.MIN_VALUE;

        for (int  i = 0; i < A.length; i++){

            if (A[i] > first_max){

                second_max = first_max;
                first_max = A[i];
            }
            else if (A[i] > second_max){
                second_max = A[i];
            }
        }
        return new int[]{first_max,second_max};
    }

    public static void main(String args[]){

        int A1[] = {1,23,42,52,65};
        int maxs[] = findMaxInArray(A1);
        System.out.println(maxs[0]);
        System.out.println(maxs[1]);
    }
}