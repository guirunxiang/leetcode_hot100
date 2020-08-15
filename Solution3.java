/**
 * 3.无重复字符的最长子串
 * 给定一个字符串，找出其中不含有重复字符的最长字串长度
 */

 //滑动窗口
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int len = s.length();
        int res = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        while(right < len) {
            char c1 = s.charAt(right);
            map.put(c1, map.getOrDefault(c1, 0) + 1);
            right++;

            while(map.get(c1) > 1) {
                char c2 = s.charAt(left);
                map.put(c2, map.getOrDefault(c2, 0) - 1);
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res == Integer.MIN_VALUE ? 0 : res;
    }
}