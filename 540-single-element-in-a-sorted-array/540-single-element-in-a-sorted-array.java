class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
            while(i<nums.length){
                if( i==nums.length-1){
                    return nums[nums.length-1];
                }else{
                    if ( nums[i]==nums[i+1] ){
                        i+=2;
                    } else{
                        return nums[i];
                    }
                }
                
            }
        
        return nums[i];
    }
}