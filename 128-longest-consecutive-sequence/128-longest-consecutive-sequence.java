class Solution {
    public int longestConsecutive(int[] nums) {
        
        int count=1;
        int maxi=1;
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        } else {
              for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    continue;
                }else {
                    if(nums[i]+1==nums[i+1]){
                        count++;
                    } else {
                        count =1;
                    }
                    if(count>maxi){
                        maxi=count;
                    }
                }
            }  
        }
        
        return maxi;
    }
}