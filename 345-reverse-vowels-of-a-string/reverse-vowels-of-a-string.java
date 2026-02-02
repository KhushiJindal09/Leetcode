class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = s.length()-1;
        while(left < right) {
            char l = Character.toLowerCase(arr[left]);
            char r = Character.toLowerCase(arr[right]);
        if (l!='a' && l != 'e' && l != 'i' && l != 'o' && l != 'u') {
            left++;
        }
        else if (r!='a' && r!='e' && r!='i' && r!='o' && r!='u') {
            right--;
        }
        else {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        }
        return new String(arr);
    }
}