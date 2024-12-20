public class ThreeSum {
    public static int [] ThreeSum(int nums[],int target){
        for(int i = 0;  i < nums.length;i++){
            for(int j  =  i +1; j< nums.length;j++){
                for(int k = j+1; k <nums.length;k++){
                    if(nums[i]+nums[j] +nums[k] == target){
                        return new int [] {i,j,k};
                    }
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
    public static void main(String args[]){
        int nums[]={1,2,3,7,11};
        int target = 6;
        int result []= ThreeSum(nums,target);
        System.out.print("indices: "+ result[0]+" "+result[1]+" "+result[2]);
    }
}