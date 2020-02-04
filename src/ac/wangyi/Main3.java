package ac.wangyi;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leveTotal = sc.nextInt();
        int orderNumber = sc.nextInt();
        int[] array = new int[leveTotal];
        int[] array2 = new int[leveTotal];
        //表示每层现存量
        for (int i = 0; i < leveTotal; i++) {
            array2[i] = 0;
        }
        //表示每层容量
        for (int i = 0; i < leveTotal; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < orderNumber; i++) {
            int order = sc.nextInt();
            if (order == 2) {
                int level = sc.nextInt() - 1;
                int volumn = sc.nextInt();
                while (volumn != 0 && level < leveTotal) {
                    if (volumn >= array[level]) {
                        if (array2[level] == array[level]) {
                            level++;
                            continue;
                        } else {
                            if (array2[level] != 0) {
                                int shengyu = array[level] - array2[level];
                                array2[level] = array[level];
                                volumn -= shengyu;
                                level++;
                                continue;
                            } else {
                                array2[level] += array[level];
                                volumn -= array[level];
                                level++;
                                continue;
                            }

                        }

                    } else {
                        array2[level] += volumn;
                        break;
                    }
                }
            }
            if (order == 1) {
                int k = sc.nextInt();
                System.out.println(array2[k - 1]);
            }
        }


    }
}
