class Solution {
    public List<List<Integer>> combine(int n, int k) {
          List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        boolean [] found=new boolean[n];
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        helper(0,ans,curr,nums,k,found);
        return ans;
    }
    void helper(int idx,List<List<Integer>> ans,List<Integer> curr,int[]nums,int k,boolean [] found){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(found[i]){
                continue;
            }
            found[i]=true;
            curr.add(nums[i]);
            helper(i+1,ans,curr,nums,k,found);
            found[i]=false;
            curr.remove(curr.size()-1);
        }
    }
}