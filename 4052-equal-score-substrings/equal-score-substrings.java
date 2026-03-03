class Solution {
    public boolean scoreBalance(String s) {
        int total = 0;
        for(char c: s.toCharArray()) {
            total+=c-'a'+1;
        }
        int leftSum = 0;
        for(int i = 0; i<s.length()-1; i++) {
            leftSum += s.charAt(i) - 'a' + 1;
            if (leftSum == total - leftSum) {
                return true;
            }
        }
        return false;
    }
}