package AC.practice;

import java.util.HashSet;

/**
 * 4.对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。
 * 给定一个字符串(不一定全为字母)A及它的长度n。请返回第一个重复出现的字符。保证字符串中有重复字符，字符串的长度小于等于500。
 * <p>
 * 方法1：这是前辈给出的算法，利用HashSet的特性，即不允许重复放入元素，所以一旦检测到重复元素就返回false。
 * 对于本道题来说，这种方法简洁且容易理解，能高效实现功能，但是这种方法普适性较差。
 * 链接：https://blog.csdn.net/hqm12345qw/article/details/52154249
 */
public class Practice004 {
    public static void main(String[] args) {
        String A = "qywyer23tdd";

        char b = findFirstRepeat(A);
        System.out.println(b);
    }

    public static char findFirstRepeat(String A) {
        //利用HashSet不允许有重复对象的特点，完美解决
        HashSet hashSet = new HashSet();
        char[] temp = A.toCharArray();

        for (int i = 0; i < A.length(); i++) {
            boolean flag = hashSet.add(temp[i]);
            if (flag == false) {
                return temp[i];
            }
        }
        return '0';
    }
}

/**
 * 延伸：返回第一个只出现一次的字符，返回最后一个出现次数不为1的字符，返回所有出现次数为1的字符或者出现次数不为1的字符，返回给定出现次数的字符等等。
 * <p>
 * import java.util.ArrayList;
 * import java.util.LinkedHashMap;
 * import java.util.List;
 * import java.util.Map;
 * import java.util.Map.Entry;
 * <p>
 * public class g {
 * private static void findFirstRepeat(String A, int n) {
 * int sum = 1;//新插入的key-value给value赋初始值都为1
 * //用LinkedHashMap来存储键值对
 * //HashMap插入和输出顺序不一样
 * //但LinkedHashMap插入和输出顺序相同，即先存的先显示，也就是尾插
 * //HashSet要求不能存重复元素，但HashMap和LinkedHashMap可以存重复元素。
 * Map<String, Integer> hashMap = new LinkedHashMap
 * <String, Integer>();
 * for (int i = 0; i < n; i++) {
 * //将main中传过来的String类型参数一个字符一个字符的转化为char类型，方便处理。
 * char item = A.charAt(i);
 * //再将每一个char类型的字符转化为String类型。这一步操作和上一步操作作用是分离出每一个字符。
 * String item2 = String.valueOf(item);
 * String key = item2;
 * // 判断是否包含指定的键值
 * boolean contains = hashMap.containsKey(key);
 * if (contains) { // 如果条件为真
 * sum++;
 * hashMap.put(item2, sum);// 输出信息
 * } else {
 * sum = 1;
 * hashMap.put(item2, sum);
 * }
 * }
 * //输出存进哈希表中的所有键值对
 * System.out.println(hashMap);
 * //以下是通过给定的value值反查key的过程
 * //将所有的键值对存在一个entrySet中
 * //遍历entrySet,若找到value等于给定的value值，则将其对应key值存在keyList中。
 * List<String> keyList = new ArrayList<String>();
 * for (Entry<String, Integer> e : hashMap.entrySet()) {
 * if (e.getValue().equals(2)) {
 * keyList.add(e.getKey());
 * }
 * }
 * //最后遍历keyList，输出第一次出现的key即可
 * for (String i : keyList) {
 * System.out.println(i);
 * break;
 * }
 * }
 * public static void main(String[] args) {
 * String A = "qywyer2333333333tdd";
 * int n = A.length();
 * findFirstRepeat(A, n);
 * }
 * }
 */
