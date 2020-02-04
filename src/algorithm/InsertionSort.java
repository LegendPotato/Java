package algorithm;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            //先把外层循环当前变量保存起来
            int temp = arr[i];
            int j = i;
            //元素向后移
            for (; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            //把临时变量保存在最后的合适位置
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr2 = {3, 9, 6, 10, 6, 5, 8, 3, 1, 1};

        InsertionSort.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        ;
    }

}
