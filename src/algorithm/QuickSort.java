package algorithm;

import java.util.Arrays;

public class QuickSort {

    //普通快速排序，关键在partition这一步
    private static int partition(int[] a, int low, int high) {
        //先将第一个元素保存为数轴
        int pivot = a[low];
        while (low < high) {
            while (low < high && a[high] >= pivot) high--;
            a[low] = a[high];
            while (low < high && a[low] <= pivot) low++;
            a[high] = a[low];
        }
        //此时low == high，将枢轴保存在这个位置，并返回下标
        a[low] = pivot;
        return low;
    }

    private static void sort(int[] a, int low, int high) {
        if (low < high) {
            //partition这一步不仅移动元素，而且返回枢轴的最后位置
            int pivotLoc = partition(a, low, high);
            //递归的对剩余部分做排序
            sort(a, low, pivotLoc - 1);
            sort(a, pivotLoc + 1, high);
        }
    }


    public static void main(String[] args) {
        int[] a = {10, 9, 2, 10, 6, 8, 4, 1, 9, 10};

        QuickSort.sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }
}
