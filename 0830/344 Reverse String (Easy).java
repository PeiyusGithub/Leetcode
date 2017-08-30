class Solution {
    public String reverseString(String s) {
        if (s == "" || s.length() == 1) return s;
        StringBuilder temp = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        
        for (int i = temp.length() - 1; i >= 0; i--) {
            ans.append(temp.charAt(i));
        }
        return ans.toString();
    }
}