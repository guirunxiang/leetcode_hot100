/**
 * 5.最长回文子串
 */
 //中心扩散解法
 class Solution5_1 {
     public String longestPalindrome(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i+1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
     }

     private String palindrome(String s, int left, int right) {
         while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
             left--;
             right++;
         }
         return s.substring(left+1, right);
     }
 }