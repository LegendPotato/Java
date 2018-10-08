package AC.bytecode;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Equipment> list = new ArrayList();
        int k = 4;
        while (k-- > 0){
            Equipment e =  new Equipment(sc.nextInt(),sc.nextInt());
            list.add(e);
        }
        Collections.sort(list, new Comparator<Equipment>() {
            @Override
            public int compare(Equipment o1, Equipment o2) {
                if(o1.level/o1.price >= o2.level/o2.price) return -1;
                return 1;
            }
        });
        int result = 0;
        for (int i = 0; i < m && n>0 ; i++) {
            if (list.get(i).price <= n){
                result += list.get(i).level;
                n -= list.get(i).price;
            }
        }
        System.out.println(result);
    }
}
class Equipment {
    int price;
    int level;

    public Equipment(int price, int level) {
        this.price = price;
        this.level = level;
    }
}