/**
 * 25.跳跃游戏
 */
class Solution25 {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for(int i = 0; i < nums.length; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if(farthest <= i){
                return false;
            }
        }
        return farthest >= nums.length - 1;
    }
}