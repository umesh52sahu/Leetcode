class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr=new ArrayList<Integer>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        sets(nums,0 , curr,ans);
        return ans;
    }
    public void sets(int[] nums ,int i, List<Integer> curr, List<List<Integer>> ans ){
        if(i==nums.length){
            ans.add(new ArrayList<Integer>(curr));
            return ;
        }
        curr.add(nums[i]);
        sets(nums,i+1,curr,ans);
        curr.remove(curr.size()-1);
        sets(nums,i+1,curr,ans);
        
    }
}