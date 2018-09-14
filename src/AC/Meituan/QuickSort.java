package AC.Meituan;

import java.util.Arrays;

public class QuickSort {

    static void sort(int[] array, int start, int end) {

        if (start >= end) return;
        //快排序是先partition,后递归
        int pivotLocation = partition(array, start, end);
        //递归的时候，不用带上array[pivotLocation]了
        sort(array, start, pivotLocation - 1);
        sort(array, pivotLocation + 1, end);
    }

    //partition的过程就是排序的过程
    static int partition(int[] array, int start, int end) {
        //先对“哨兵”做备份
        int temp = array[start];
        while (start < end) {
            while (array[end] >= temp && start < end) {
                end--;
            }
            array[start] = array[end];
            while (array[start] <= temp && start < end) {
                start++;
            }
            array[end] = array[start];
        }
        array[start] = temp;
        return start;
    }


    public static void main(String[] args) {
        int[] array = {10, 2, 8, 14, 7, 19, 9, 5, 4, 1};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
