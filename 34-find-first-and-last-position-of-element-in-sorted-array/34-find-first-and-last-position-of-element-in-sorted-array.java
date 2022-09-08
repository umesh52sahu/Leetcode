class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int key1=-1;
        while(start <= end){
            int mid = start - (start-end) / 2;
            if(nums[mid] == target){
                key1=mid;
                end = mid-1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        
        start = 0;
        end = nums.length-1;
        int key2=-1;
        while(start <= end){
            int mid = start - (start-end) / 2;
            if(nums[mid] == target){
                key2=mid;
                start= mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        int[] arr=new int[2];
        arr[0]=key1;
        arr[1]=key2;
        return arr;
    }
}