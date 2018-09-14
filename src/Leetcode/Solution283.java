package Leetcode;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        //设定一个K变量，表示保存非零元素的指针
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            } else {
                continue;
            }
        }
        for (; k < nums.length; k++) {
            nums[k] = 0;
        }
    }
}
