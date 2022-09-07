class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int flag = 0;
        int max=0;
        for ( int i = 0 ; i < nums.length ; i++ ){
            if ( nums[i]==1){
                flag++;
                if(flag > max){
                    max = flag;
                }
            } else{
                flag = 0;
            }
        }
        return max;
        
    }
}