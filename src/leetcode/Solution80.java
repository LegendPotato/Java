package leetcode;

/**
 * 80.删除排序数组中的重复项 II
 *
 * @author zhangshuai_sx
 * @date 2020/2/4 23:55
 */

/*
给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

示例 1:
给定 nums = [1,1,1,2,2,3],
函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
你不需要考虑数组中超出新长度后面的元素。
示例 2:
给定 nums = [0,0,1,1,1,1,2,3,3],
函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。
你不需要考虑数组中超出新长度后面的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution80 {

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int i = 0, count = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
                count = 1;
            } else if (count >= 2) {
                continue;
            } else {
                nums[++i] = nums[j];
                count++;
            }
        }
        return i + 1;

        /**
         * class Solution {
         *
         *     public int removeDuplicates(int[] nums) {
         *         int j = 1, count = 1;
         *         for (int i = 1; i < nums.length; i++) {
         *             // If the current element is a duplicate, increment the count.
         *             if (nums[i] == nums[i - 1]) {
         *                 count++;
         *             } else {
         *                 // Reset the count since we encountered a different element
         *                 // than the previous one.
         *                 count = 1;
         *             }
         *             // For a count <= 2, we copy the element over thus
         *             // overwriting the element at index "j" in the array
         *             //
         *             if (count <= 2) {
         *                 nums[j++] = nums[i];
         *             }
         *         }
         *         return j;
         *     }
         * }
         */

/**
 *         Java代码最少解法:
 *
 *         class Solution {
 *             public int removeDuplicates(int[] nums) {
 *                 int i = 0;
 *                 for (int n : nums)
 *                     if (i < 2 || n > nums[i - 2])
 *                         nums[i++] = n;
 *                 return i;
 *             }
 *         }
 */

    }

    public static void main(String[] args) {
        int[] temp = new int[]{1, 1, 1, 2, 2, 3};
        Solution80 solution80 = new Solution80();
        System.out.println(solution80.removeDuplicates(temp));
    }
}
