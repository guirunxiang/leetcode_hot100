/**
 * 5.最长回文子串
 * 
 * （1）定义状态
 * dp[i][j]表示子串s[i...j]是否为回文子串，这里字串s[i...j]定义为左闭右闭区间
 * （2）思考状态转移方程
 * dp[i][j] = (s[i] == s[j]) and dp[i+1][j-1]
 * dp[i+1][j-1]得考虑边界情况, 即 j - 1 - (i + 1) + 1 < 2, 整理得 j - i < 3
 * （3）初始状态
 * 单个字符一定是回文串，即dp[i][i] = true
 */

 class Solution5_2 {
    public String longestPalindrome(String s) {
       int len = s.length();
       if(len < 2) {
           return s;
       }

       int maxLen = 1;
       int begin = 0;

       boolean[][] dp = new boolean[len][len];
       char[] charArray = s.toCharArray();

       for(int i = 0; i < len; i++) {
           dp[i][i] = true;
       }

       for(int j = 1; j < len; j++) {
           for(int i = 0; i < j; i++) {
               if(charArray[i] != charArray[j]) {
                   dp[i][j] = false;
               }
               else {
                   if(j - i < 3) {
                       dp[i][j] = true;
                   } 
                   else {
                       dp[i][j] = dp[i+1][j-1];
                   }
               }

               if(dp[i][j] && j-i+1 > maxLen) {
                   maxLen = j - i + 1;
                   begin = i;
               }
           }
       }
       return s.substring(begin, begin + maxLen);
    }
}