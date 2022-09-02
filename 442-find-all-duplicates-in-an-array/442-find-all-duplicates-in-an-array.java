class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int i=0;
        Arrays.sort(nums);
       while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                arr.add(nums[i]);
                i=i+2;
            }else {
                i++;
            }
        }
        return arr;
    }
}