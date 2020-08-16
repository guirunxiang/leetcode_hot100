/**
 * 7.盛水最多的容器
 */
class Solution7 {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0, right = len - 1;
        int res = Integer.MIN_VALUE;
        while(left < right) {
            if(height[left] < height[right]) {
                res = res > (right - left) * height[left] ? res : (right - left) * height[left];
                left++;
            }
            else {
                res = res > (right - left) * height[right] ? res : (right - left) * height[right];
                right--;
            }
        }
        return res;
    }
}