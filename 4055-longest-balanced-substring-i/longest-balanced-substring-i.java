class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;
        for(int i = 0; i<n; i++) {
             int[] freq = new int[26];
           int unique = 0;
           int maxfreq = 0;
           for(int j = i; j<n; j++) {
            int idx = s.charAt(j) - 'a';
        if (freq[idx] == 0) unique++;
        freq[idx]++; 
        maxfreq = Math.max(maxfreq, freq[idx]);
        int length= j-i+1;
        if (length == unique * maxfreq) {
            maxLen = Math.max(maxLen, length);
        }
           }
        }
        return maxLen;
    }
}