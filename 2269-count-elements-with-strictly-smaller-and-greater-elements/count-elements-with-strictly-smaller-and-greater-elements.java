class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++) {
            int num = nums[i];
            min = Math.min(min, num);
            max = Math.max(max,num);
        }
        int count = 0;
        for (int i = 0; i<n; i++) {
            int num = nums[i];
            if (num > min && num < max) {
                count++;
            }
        }
        return count;
    }
}