package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution205 {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (!map.containsKey(c1) && map.containsValue(c2)) {
                return false;
            } else if (!map.containsKey(c1)) {
                map.put(c1, c2);
            } else if (map.get(c1) != c2) {
                return false;
            } else {
                continue;
            }
        }
        return true;
    }
}
