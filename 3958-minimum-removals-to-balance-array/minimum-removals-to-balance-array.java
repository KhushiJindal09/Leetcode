class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, maxLen = 0;
        for(int right = 0; right<n; right++) {
            while((long)nums[right] >(long)k * nums[left]) {
                left++;
            }
         int currLen = right-left+1;
         if (currLen > maxLen) {
            maxLen = currLen;
         }
        }  
        return n - maxLen;   
    }
}