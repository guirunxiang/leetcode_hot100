/**
 * 9.电话号码的字母组合
 */

class Solution9 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        int len = digits.length();
        if(len == 0) return res;
        String[] map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        dfs(digits, map, 0, "", res);
        return res;
    }

    private void dfs(String digits, String[] map, int start, String path, List<String> res) {
        if(start == digits.length()) {
            res.add(pre);
            return;
        }

        String nextStr = map.[digits.charAt(start) - '2'];
        for(int i = 0; i < nextStr.length(); i++) {
            dfs(digits, map, start + 1, path + nextStr.charAt(i), res);
        }
    }
}