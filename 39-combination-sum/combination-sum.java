class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }
    void backtrack(int[] arr, int index, int target, List<Integer> path, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if (target < 0) return;
        for (int i = index; i<arr.length; i++) {
            path.add(arr[i]);
            backtrack(arr, i, target - arr[i], path, ans);
            path.remove(path.size() - 1);
        }
    }
}