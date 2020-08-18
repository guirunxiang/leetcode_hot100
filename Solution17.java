/**
 * 17.搜索旋转排序数组
 */
class Solution17 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while(left < right) {
            int mid = (left + right + 1) >>> 1;
            if(nums[mid] < nums[right]) {
                if(target >= nums[mid] && target <= nums[right]) {
                    left = mid;
                }
                else {
                    right = mid - 1;
                }
            }
            else {
                if(target >= nums[left] && target <= nums[mid - 1]) {
                    right = mid - 1;
                }
                else {
                    left = mid;
                }
            }
        }
        if(nums[left] == target) return left;
        return -1;
    }
}