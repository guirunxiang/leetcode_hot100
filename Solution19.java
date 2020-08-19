/**
 * 19. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target，
 * 找出 candidates 中所有可以使数字和为 target 的组合
 * candidates 中的数字可以无限制重复被选取
 */
class Solution19 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int[] candidates, int start, int target, List<Integer> path, List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = start; i < candidates.length && target >= candidates[i]; i++) {
            path.add(candidates[i]);
            dfs(candidates, i, target - candidates[i], path, res);
            path.remove(path.size() - 1);
        }
    }
}