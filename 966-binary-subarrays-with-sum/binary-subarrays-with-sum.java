class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // HashMap <Integer, Integer> map = new HashMap<>();
        // map.put(0,1);
        // int sum = 0;
        // int count = 0;
        // for(int i = 0; i<nums.length; i++) {
        //     sum += nums[i];
        //     if(map.containsKey(sum - goal)) {
        //         count += map.get(sum - goal);
        //     }
        //     map.put(sum, map.getOrDefault(sum,0)+1);
        // }
        // return count;

         int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == goal) {
                    count++;
                }
            }
        }
        return count;
    }
}