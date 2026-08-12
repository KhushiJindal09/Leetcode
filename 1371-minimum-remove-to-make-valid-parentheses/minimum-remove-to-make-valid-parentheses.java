class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int[] removeIndex = new int[s.length()];
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            }
            else if (ch == ')') {
                if(!st.isEmpty()) {
                    st.pop();
                }
                else {
                    removeIndex[i] = 1;
                }
            }
        }
        while(!st.isEmpty()) {
            removeIndex[st.pop()] = 1;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i<s.length(); i++) {
            if(removeIndex[i] != 1){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}