package ac.xiaomi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        int max = set.size();
        for (int i = 0; i < number; i++) {
            List<Integer> list = new ArrayList<>();
            String input = sc.nextLine();
            String[] strings = input.split(" ");
            for (int j = 0; j < strings.length; j++) {
                if (!set.contains(Integer.parseInt(strings[j]))) {
                    set.add(Integer.parseInt(strings[j]));
                    list.add(Integer.parseInt(strings[j]));
                    max++;
                } else {
                    list.add(Integer.parseInt(strings[j]));
                }

            }
        }
    }
}
