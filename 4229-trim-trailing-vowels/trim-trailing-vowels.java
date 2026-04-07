class Solution {
    public String trimTrailingVowels(String s) {
        int i = -1;
        for (int j = s.length()-1; j>=0; j--) {
            char c = s.charAt(j);
            if (c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }
            i = j;
            break;
        }
        if (i == -1) {
            return "";
        }
        return s.substring(0, i + 1);
    }
}