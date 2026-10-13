
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] nums1 = new int[n - 1];
        int[] nums2 = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                nums1[i - 1] = nums[i];
            }

            if (i != n - 1) {
                nums2[i] = nums[i];
            }
        }
        return Math.max(solve(nums1), solve(nums2));
    }

    public int solve(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }
        return dp[n - 1];
    }
}
