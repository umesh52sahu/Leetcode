class Solution {
    public boolean check(int[] nums) {
        
        for(int x=0; x<nums.length; x++){
            int flag=1;
            for(int i=0; i<nums.length-1; i++){
                if(nums[(i+x)%nums.length]>nums[(i+x+1)%nums.length])
                    flag=0;
            }
            if(flag==1){
                return true;
            }
        }
        return false;
    }
}