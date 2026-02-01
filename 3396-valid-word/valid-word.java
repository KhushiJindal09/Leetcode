class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        int vowel = 0;
        int constant = 0;
        for (int i = 0; i<word.length();i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowel++;
                }
                else {
                    constant++;
                }
            }
            else if (Character.isDigit(ch)) {
                continue;
            }
            else {
                return false;
            }
        }
        if (vowel >= 1 && constant >= 1) return true;
        else return false;
    }
}