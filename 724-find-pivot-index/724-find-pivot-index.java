class Solution {
    public int pivotIndex(int[] nums) {
        int left_sum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum=sum + nums[i];
        }
         int right_sum=sum;
        for(int i=0;i<nums.length;i++){
            right_sum = sum-nums[i] - left_sum;
            if(left_sum == right_sum){
                return i;
            } 
            left_sum = left_sum + nums[i];
        }
         return -1 ;
    }
}