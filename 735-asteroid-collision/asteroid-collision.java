class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int[] stack = new int[n];
        int top = -1; 
        for (int i = 0; i < n; i++) {
            int curr = asteroids[i];
            boolean alive = true;

            while (top >= 0 && curr < 0 && stack[top] > 0) {
                if (stack[top] < -curr) {
                    top--; 
                } else if (stack[top] == -curr) {
                    top--; 
                    alive = false;
                    break;
                } else {
                    alive = false; 
                    break;
                }
            }
            if (alive) stack[++top] = curr;
        }
        int[] res = new int[top + 1];
        for (int i = 0; i <= top; i++) {
            res[i] = stack[i];
        }
        return res;
    }
}