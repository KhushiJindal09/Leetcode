class Solution {
    public int trap(int[] height) {
        int[] leftM = new int[height.length];
        leftM[0] = height[0];
        for(int i = 1; i < height.length; i++){
            leftM[i] = Math.max(leftM[i - 1], height[i]);
        }
        int[] rightM = new int[height.length];
        rightM[height.length-1] = height[height.length-1];
        for(int i = height.length - 2; i >= 0; i--){
            rightM[i] = Math.max(rightM[i + 1], height[i]);
        }
        int water = 0;
        for(int i = 0; i < height.length; i++){
            water += Math.min(leftM[i], rightM[i]) - height[i];
        }
        return water;
    }
}