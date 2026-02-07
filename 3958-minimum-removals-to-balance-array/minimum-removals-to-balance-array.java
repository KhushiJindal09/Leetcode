class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, count = 0;
        for(int j = 0; j<n; j++) {
            if(i<=j && (long)nums[j]> (long)nums[i]*k) {
                i++;
                count++;
            }
        } 
        return count;
    }
}