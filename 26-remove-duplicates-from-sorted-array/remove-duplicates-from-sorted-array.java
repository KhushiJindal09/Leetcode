class Solution {
    public int removeDuplicates(int[] nums) {
        int num = nums.length;
        if(num== 0) return 0;
        int i = 0;
        for(int j = 1; j<num; j++) {
            if(nums[i]!=nums[j]) 
            i++;
            nums[i] = nums[j];
        }
        return i+1;
    }
}