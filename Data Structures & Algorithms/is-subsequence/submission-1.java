class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
     int left =0;
     for(int i=0;i<t.length();i++){
        if (left < s.length() && s.charAt(left) == t.charAt(i)) {
                left++;
            }
        }

        return left == s.length();
    }
}