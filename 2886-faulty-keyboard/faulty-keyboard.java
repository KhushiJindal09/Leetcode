class Solution {
    public String finalString(String s) {
       String str = "";
        for (int i = 0; i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == 'i') {
           str = new StringBuilder(str).reverse().toString();
            }
            else {
                str += ch;
            }
        }
        return str;
    }
}