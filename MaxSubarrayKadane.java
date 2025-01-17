public class MaxSubarrayKadane {
public static int MaxsubArray(int arr[]){
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0 ;i < arr.length; i++){
        currentSum = currentSum + arr[i];
        if(currentSum > maxSum){
            maxSum = currentSum;
        }
        if(currentSum < 0){
            currentSum = 0;
        }
    }
    return maxSum;
}

public static void main(String args[]){
    int array [] = {1, 3, 8, -2, 6, -8, 5};
    int maximumSum = MaxsubArray(array);
    System.out.print(maximumSum);
}
}

