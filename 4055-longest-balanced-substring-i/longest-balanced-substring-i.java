class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;
        for(int i = 0; i<n; i++) {
             int[] freq = new int[26];
            for (int j = i; j<n; j++) {
                freq[s.charAt(j) - 'a']++;
               int minfreq = Integer.MAX_VALUE;
                int maxfreq = 0;
            for(int k = 0; k < 26; k++) {
                if(freq[k] > 0) {
                    minfreq = Math.min(minfreq, freq[k]);
                    maxfreq = Math.max(maxfreq, freq[k]);
                }
            }
            if(minfreq == maxfreq) {
                maxLen = Math.max(maxLen, j-i+1);
            }
        }
        }
        return maxLen;
    }
}