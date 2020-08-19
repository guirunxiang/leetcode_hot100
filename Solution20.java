/**
 * 20.接雨水
 */
class Solution20 {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        if(height.length == 0) return 0;
        int lmax = height[left], rmax = height[right];
        int res = 0;
        while(left < right) {
            lmax = Math.max(lmax, height[left]);
            rmax = Math.max(rmax, height[right]);
            if(lmax < rmax) {
                res += (lmax - height[left]);
                left++;
            }
            else{
                res += (rmax - height[right]);
                right--;
            }
        }
        return res;
    }
}