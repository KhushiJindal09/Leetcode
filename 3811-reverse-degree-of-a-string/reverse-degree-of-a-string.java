class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int val = ch - 'a' + 1;
            int rev = 26 - val + 1;
              ans = ans + rev * (i + 1);
        }
        return ans;
    }
}