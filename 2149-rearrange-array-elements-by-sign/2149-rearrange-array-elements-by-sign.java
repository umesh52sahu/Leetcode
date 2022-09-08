class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0;
        int j=0;
        int[] p=new int[nums.length/2];
        int[] n=new int[nums.length/2];
        for(int z=0;z<nums.length;z++){
            if(nums[z]<0){
                n[j]=nums[z];
                j++;
            } 
            if(nums[z]>0){
                p[i]=nums[z];
                i++;
            }
        }
        
        for(int z=0;z<nums.length;z++){
            if(z%2==0){
                nums[z]=p[z/2];
            } else{
                nums[z]=n[z/2];
            }
        }
        return nums;
    }
}