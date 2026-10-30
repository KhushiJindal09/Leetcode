class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high = high + nums[i];
        }
        while (low <= high) {
            int mid = low + (high - low)/2;
            int sum = 0;
            int count = 1;
            for (int i = 0; i<nums.length; i++) {
                if (sum + nums[i] > mid) {
                    count++;
                    sum = nums[i];
                }
                else {
                    sum = sum+nums[i];
                }
            }
            if (count <= k) high = mid -1;
            else low = mid+1;
        }
        return low;
    }
}