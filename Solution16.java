/**
 * 16.最长有效括号
 * 
 * 在此方法中，利用两个计数器left和right。
 * 从左往右遍历字符串，对于遇到的每个 '('，增加left,
 * 对于遇到的每个 ')'，增加right, 每当 left == right时，
 * 计算当前有效字符串的长度，并且记录目前为止找到的最长子字符串
 * 当right比left大时，将left和right同时变回0.
 * 然后用同样的方法从右往左遍历
 */

 class Solution16 {
     public int longestValidParentheses(String s) {
         int left = 0, right = 0, maxLength = 0;
         for(char c : s.toCharArray()) {
             if(c == '(') {
                 left++;
             }
             else{
                 right++;
             }

             if(left == right) {
                 maxLength = Math.max(maxLength, right * 2);
             }
             else if(right > left) {
                 left = 0;
                 right = 0;
             }
         }

         left = 0;
         right = 0;
         for(int i = s.length() - 1; i >= 0; i--) {
             if(s.charAt(i) == '(') {
                 left++;
             }
             else{
                 right++;
             }
             if(left == right) {
                maxLength = Math.max(maxLength, left * 2);
             }
             else if(left > right) {
                 left = 0;
                 right = 0;
             }
         }

         return maxLength;
     }
 }