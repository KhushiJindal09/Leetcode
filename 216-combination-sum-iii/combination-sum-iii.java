class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    public void helper(int start, int k, int target, List<Integer> ds,
                       List<List<Integer>> ans) {
        if (ds.size() == k) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (i > target) {
                break;
            }
            ds.add(i);
            helper(i + 1, k, target - i, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}