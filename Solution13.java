/**
 * 13. 括号生成
 * 数字 n 代表生成括号的对数，设计一个函数，用于能够生成所有可能的并且 有效的 括号组合
 */

/**
 * 1.当前左右括号都有大于0个可以使用的时候，才产生分支；
 * 2.产生左分支的时候，只看当前是否还有左括号可以使用；
 * 3.产生右分支的时候，还受到左分支的限制，右边剩余可以使用的括号数量一定得严格大于左边剩余数量的时候，才可以产生分支；
 * 4.在左边和右边剩余的括号数都等于 0 的时候结算。
 */
class Solution13 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(n, n, "", res);
        return res;
    }

    private void dfs(int left, int right, String curStr, List<String> res) {
        if(left == 0 && right == 0) {
            res.add(curStr);
            return;
        }

        if(left > 0) {
            dfs(left - 1, right, curStr + "(", res);
        }

        if(right > left) {
            dfs(left, right - 1, curStr + ")", res);
        }
    }


}