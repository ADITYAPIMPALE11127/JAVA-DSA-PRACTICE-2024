public class TwoSum {
    public static int [] TwoSum(int nums[],int target){
        for(int i = 0;  i < nums.length;i++){
            for(int j  =  i +1; j< nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int [] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
    public static void main(String args[]){
        int nums[]={2,3,7,11};
        int target = 9;
        int result []= TwoSum(nums,target);
        System.out.print("indices: "+ result[0]+" "+result[1]);
    }
}