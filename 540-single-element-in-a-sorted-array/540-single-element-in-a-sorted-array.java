class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        
        while(i<nums.length){
            if(i==nums.length-1){
                return nums[i];
            } else if(nums[i]!=nums[i+1]){
                return nums[i];
            }
            i=i+2;
        }
        return -1;
    }
}