/**
 * 24.最大子序和
 */
class Solution24 {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int len = nums.length;
        if(len == 0) return 0;
        if(len == 1) return nums[0];
        int[] dp = new int[len];

        for(int i = 0; i < len; i++) {
            if(i == 0){
                dp[i] = nums[0];
            }
            else {
                dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
                res = Math.max(dp[i], res);
            }
        }
        return res;
    }
}