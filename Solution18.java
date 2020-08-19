/**
 * 18. 在排序数组中查找元素的第一个和最后一个位置
 */
class Solution18 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] res = {-1, -1};
        if(nums.length == 0) return res;
        while(left < right) {
            int mid = (left + right) >>> 1;
            if(target > nums[mid]) {
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        if(nums[left] == target) res[0] = left;

        left = 0;
        right = nums.length - 1;
        while(left < right) {
            int mid = (left + right + 1) >>> 1;
            if(target < nums[mid]) {
                right = mid - 1;
            }
            else{
                left = mid;
            }
        }
        if(nums[right] == target) res[1] = right;

        return res;
    }
}