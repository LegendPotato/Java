package Leetcode;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //既然nums1数组足够大，而且返回的是num1,那就先把nums2的元素拷贝过去,再利用插排排序
        for (int i = m; i < nums1.length && i - m < n; i++) {
            nums1[i] = nums2[i - m];
        }
        for (int i = m; i < m + n; i++) {
            int temp = nums1[i];
            int j = i;
            for (; j > 0 && nums1[j - 1] > temp; j--) {
                nums1[j] = nums1[j - 1];
            }
            nums1[j] = temp;
        }
    }
}
