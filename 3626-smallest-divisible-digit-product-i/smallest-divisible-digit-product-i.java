class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 0;
        for(int i = n; i <= Integer.MAX_VALUE; i++) {
            int product = 1;
            int num = i;

            while (num!=0) {
                int rem = num % 10;
                product*=rem;
                num = num/10;
            } 
            if(product % t == 0) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}