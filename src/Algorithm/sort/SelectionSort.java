package Algorithm.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr2 = {4, 9, 10, 7, 9, 5, 2, 3, 2, 1};

        SelectionSort.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }


}
