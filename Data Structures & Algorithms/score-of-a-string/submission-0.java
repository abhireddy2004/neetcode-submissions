class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int ch = s.charAt(0);
        for(int i=1;i<s.length();i++){
            sum += Math.abs(s.charAt(i) - ch);
            ch = s.charAt(i);
        }
        return sum;
    }
}