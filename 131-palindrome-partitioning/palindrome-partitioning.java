class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), result);
        return result;
    }
    public void helper(String s, int index, List<String> list, List<List<String>> result) {
        if(index == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < s.length(); i++) {   
            if(isPalindrome(s, index, i)) {
                list.add(s.substring(index, i+1));
                helper(s, i+1, list, result);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
