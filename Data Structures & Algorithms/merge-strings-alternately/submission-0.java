class Solution {
    public String mergeAlternately(String word1, String word2) {
       String rev = "";
       int left = 0; int right = 0; int i = 0;
       while(left < word1.length() && right < word2.length()){
         if(i % 2 == 0 && left < word1.length()){
            rev +=word1.charAt(left);
            left++;
            i++;
         }else{
            rev += word2.charAt(right);
            right++;
            i++;
         }
       }
       while (left < word1.length()) {
            rev += word1.charAt(left);
            left++;
        }

        while (right < word2.length()) {
            rev += word2.charAt(right);
            right++;
        }
       return rev; 
    }
}