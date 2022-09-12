class Solution {
    public int maxProduct(int[] nums) {
       int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int prod=nums[i];
            if(prod>max){
                max=prod;
            }
            for(int j=i;j<nums.length-1;j++){
                prod=prod*nums[j+1];
                if(max<prod){
                max=prod;
                }
            }
        }
        return max;
            
            
    }
}