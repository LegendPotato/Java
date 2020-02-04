package leetcode;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                array[k++] = nums1[i++];
            } else {
                array[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            array[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            array[k++] = nums2[j++];
        }
        k = array.length;
        if (k % 2 == 0) {
            return (double) (array[k / 2] + array[k / 2 + 1]) / 2;
        } else {
            return array[k / 2];
        }
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        s.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
    }
}
