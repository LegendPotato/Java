package datastructure;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsPractice {
    public static void main(String[] args) {
        //线性表
//        List list1= new ArrayList();
//        list1.add(1);
//        list1.add(1,"sssss");
//
//        System.out.println(list1.get(1));
//        System.out.println(list1);
        //链表
//        List<String> list2 = new LinkedList();
//        list2.add("sss");
//        list2.add("sss");
//        list2.add("sss");
//        list2.set(0,"ssss");
//        String a = list2.get(0);
//        System.out.println(a);
//        Iterator iterator = list2.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(list2.remove("ssss"));
//        System.out.println(list2);

        //队列
//        Queue<Integer> queue = new LinkedList();
//        queue.offer(1);
//        queue.offer(2);
//        System.out.println(queue.contains(1));
//        System.out.println(queue.peek());
//        System.out.println(queue);
        //栈
//        Deque<Integer> stack = new ArrayDeque<>();
//        stack.push(1);
//        stack.push(2);
//        System.out.println(stack);
//        int a = stack.pop();
//        System.out.println(a);
//        System.out.println(stack.peek());
//        System.out.println(stack);

        //map
        //线程不安全，可以有空值
        Map<String, Integer> map = new HashMap<>();
        map.put("bn", 2);
        map.put("s", 1);
        map.put("a", 3);
        map.put("null",null);
        System.out.println(map);

        //线程安全，推荐使用，不能有空值
        Map<String,Integer> map3= new ConcurrentHashMap<>();
        map3.put("12",12);
        map3.put("null",null);
        System.out.println(map3);

        //线程安全，低效，不能有空值
//        Map<String,Integer> map2 = new Hashtable();
//        map2.put(null,null);
//        System.out.println(map2);

//        System.out.println(map);
        //保留插入时的顺序
//        Map<String, Integer> map1 = new LinkedHashMap<>();
//        map1.put("bn", 2);
//        map1.put("s", 1);
//        map1.put("a", 3);
//        System.out.println(map1);



    }
}
