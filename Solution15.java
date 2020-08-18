/**
 * 15.下一个排列
 * 
 * 1.从后向前查找第一个相邻升序元素对 （i， i+1）， 满足A[i] < A[i+1], 此时[i+1, end) 必然是降序
 * 2.在[i+1, end) 从后向前 查找第一个满足 A[i] < A[k] 的 k.
 * 3.将A[i] 与 A[k] 交换
 * 4.可以断定此时[i+1, end)必然是降序，逆置[i+1, end), 使其升序
 * 
 */

class Solution16 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if(i >= 0) {
            int k = nums.length - 1;
            while(k > 0 && nums[i] >= nums[k]) k--;
            swap(nums, i, k);
        }
        reverse(nums, i+1);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int i) {
        int j = nums.length - 1;
        while(i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

}