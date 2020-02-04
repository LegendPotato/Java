package ac.didi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        String target = strings[0];
        char[] targetChars = target.toCharArray();
        for (int i = 1; i < strings.length; i++) {
            char[] temp = strings[i].toCharArray();
            int count = 0;
            for (int j = 0; j < targetChars.length && j < temp.length; j++) {
                if (temp[j] == targetChars[j]) {
                    continue;
                } else {
                    count++;
                }
            }
            if (count <= 2) System.out.print(String.valueOf(temp));
        }


//        Queue<String> queue = new PriorityQueue<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                char[] chars1 = o1.toCharArray();
//                char[] chars2 = o2.toCharArray();
//                if (chars1.length<chars2.length){
//                    return -1;
//                }else if(chars1.length == chars2.length){
//                    for (int i = 0; i < chars1.length;i++) {
//                        if (chars1[i] < chars2[i]){
//                            return -1;
//                        }else if (chars1[i] == chars2[i]){
//                            continue;
//                        }else {
//                            return 1;
//                        }
//                    }
//                }
//                return 1;
//            }
//        });
//        for (int i = 1; i < strings.length; i++) {
//            queue.offer(strings[i]);
//        }
//        for (int i = 0; i < 2; i++) {
//            System.out.print(queue.poll() + " ");
//        }
//        System.out.print(queue.poll());
    }
}
