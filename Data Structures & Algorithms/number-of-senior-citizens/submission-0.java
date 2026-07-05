class Solution {
    public int countSeniors(String[] details) {
       int n =  details.length;
       int cut = 0;
       for(int i=0;i<n;i++){
        String s = details[i];
        if(check(s) > 60){
            cut++;
        }
       }
       return cut;
    }
    public int check(String s){
        int n = s.length();
        String rev = "";
        rev += s.charAt(n-4);
        rev += s.charAt(n-3);
     return Integer.parseInt(rev);
    }
}