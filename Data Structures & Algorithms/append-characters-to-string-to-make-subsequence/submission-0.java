class Solution {
    public int appendCharacters(String s, String t) {
       int left = 0;

        for (int i = 0; i < s.length(); i++) {

            if (left < t.length() && s.charAt(i) == t.charAt(left)) {
                left++;
            }
        }

        return t.length() - left;
    }
}