class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void helper(int index, int[] nums, List<Integer> list,
                       List<List<Integer>> ans) {
        if (list.size() >= 2) {
            ans.add(new ArrayList<>(list));
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            if (list.size() > 0 && nums[i] < list.get(list.size() - 1)) {
                continue;
            }
            set.add(nums[i]);
            list.add(nums[i]);
            helper(i + 1, nums, list, ans);
            list.remove(list.size() - 1);
        }
    }
}