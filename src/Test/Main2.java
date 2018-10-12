package Test;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Set<Integer> set = new TreeSet<>();
        set.add(6);
        set.add(2);
        set.add(5);
        Map<String,String> map = new WeakHashMap<>();

        Map map1 = Collections.synchronizedMap(map);
        List<Integer> list = new ArrayList<>();
        list.add(323);
        list.add(423);
        list.add(322);
        list.add(43);
        int[] array = new int[10];
        array[0] = 3;
        System.out.println(Arrays.asList(array));
        for (Integer in : set){
            System.out.println(in);
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        set.iterator()
    }
}
