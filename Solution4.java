/**
 * 4.寻找两个正序数组的中位数
 */

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int midIndex = (m + n) / 2;
        int[] res = new int[2];
        int count = -1;
        int i = 0, j = 0;
        while(count < midIndex) {
            count++;
            if(i == m) {
                res[count & 1] = nums2[j++];
            }
            else if(j == n) {
                res[count & 1] = nums1[i++];
            }
            else if(nums1[i] < nums2[j]) {
                res[count & 1] = nums1[i++];
            }
            else {
                res[count & 1] = nums2[j++];
            }
        }

        if((m + n) % 2 == 1) {
            return (double)res[count & 1];
        } 
        return (res[0] + res[1]) * 0.5;
    }
}