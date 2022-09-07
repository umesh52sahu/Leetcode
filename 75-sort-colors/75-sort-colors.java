class Solution {
    public void sortColors(int[] nums) {
        int j=0;
        int i=0;
        int z=0;
        int k=0;
        
        while(i<nums.length){
            if(nums[i]==0){
                j++;
            } else if(nums[i]==1){
                z++;
            } else{
                k++;
            }
            i++;
        }
        for(i=0;i<j;i++){
            nums[i]=0;
        }
        
        for(;i<j+z;i++){
            nums[i]=1;
        }
        
        for(;i<j+z+k;i++){
            nums[i]=2;
        }
    }
}