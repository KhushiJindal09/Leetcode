class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
    helper(nums, new ArrayList<>(), ans);
        return ans;
    }

    public void helper(int[] nums, List<Integer> ds,
                       List<List<Integer>> ans) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i<nums.length; i++) {
            if(ds.contains(nums[i])) {
                continue;
            }
            ds.add(nums[i]);
            helper(nums, ds, ans);
            ds.remove(ds.size()-1);
        }


    }
}