import java.util.Arrays;
public class BubbleSort {
    public static int [] BubbleSort(int nums[]){
        int size = nums.length;
        int temp = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size - i - 1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String args[]){
        int array[] = {3,56,85,24,1,23};
        System.out.println("before Sorting: "+Arrays.toString(array));
        int Sorted [] = BubbleSort(array);
        System.out.println("after Sorting: "+Arrays.toString(Sorted));
    }
}
