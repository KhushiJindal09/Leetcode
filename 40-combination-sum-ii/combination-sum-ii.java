class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    public void helper(int index, int[] arr, int target,
                       List<Integer> ds, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (index == arr.length || target < 0) {
            return;
        }

        ds.add(arr[index]);
        helper(index + 1, arr, target - arr[index], ds, ans);
        ds.remove(ds.size() - 1);
        int nextIndex = index + 1;

        while (nextIndex < arr.length &&
               arr[nextIndex] == arr[index]) {
            nextIndex++;
        }
        helper(nextIndex, arr, target, ds, ans);
    }
}