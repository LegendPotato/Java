package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        // 暴力解法
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if ( nums[j] == target - nums[i]){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;
        // 空间换时间，利用hashmap查询近似为O（1）的特性，并且只遍历一次数组，空间复杂度为O（N）
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)){
                return new int[]{map.get(other),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
