package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        //用HashSet和HashMap的方式太复杂，增加了空间复杂度
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])){
//                Integer integer = map.get(nums[i]);
//                integer++;
//                map.put(nums[i],integer);
//            }else {
//                map.put(nums[i],1);
//            }
//        }
//        for (Integer integer : map.keySet()){
//            if (map.get(integer) != 1){
//                return true;
//            }
//        }
//        return false;
        //其实排个序，简单比较一下就行了
        if (nums.length <= 1) return false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;

    }
}
