class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        for(int i = 0; i<n; i++) {
            int z = nums[i];
            int idx = (i+z) % n;
            if (idx < 0) {
                result[i] = nums[n+idx];
            }
            else {
                result[i] = nums[idx];
            }
        }
        return result;
    } 
}