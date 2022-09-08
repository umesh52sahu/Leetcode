class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr=new int[nums.length];
        if(k>nums.length){
            k=k%nums.length;
        }
        int temp=k;
        int i;
        for(i=0; i<k; i++){
            arr[i]=nums[nums.length-temp];
            temp--;
        }
        int j=0;
        for(;i<nums.length;i++){
            arr[i]=nums[j];
            j++;
        }
        for(i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}