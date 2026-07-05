class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int cut = 0;int max = 0;
       for(int i=0;i<nums.length;i++){
         if(nums[i] != 1){
           cut = 0;
         }else if(nums[i] == 1){
         cut++;
         max = Math.max(max,cut);
         }
       }
       return max;
    }
}