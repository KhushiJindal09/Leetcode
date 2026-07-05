class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i<nums.length; i++) {
            int num = nums[i];
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i<nums.length; i++) {
            int num = nums[i];
            int rightSum = totalSum - leftSum - num;
            if (leftSum == rightSum) return i;
            leftSum += num;
        }
        return -1;
    }
}