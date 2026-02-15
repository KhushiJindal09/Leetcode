class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), result);
        return result;
    }
    public void helper(int[] nums, int index, List<Integer> list, List<List<Integer>> result) {
        result.add(new ArrayList<>(list));
        for(int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            helper(nums, i+1, list, result);
            list.remove(list.size()-1);
        }
    }
}