package Algorithm.sort;

import java.util.Arrays;

public class MergeSort{

    // 将arr[l...mid]和arr[mid+1...r]两部分进行归并
    private static void merge(int[] arr, int l, int mid, int r) {

        //空间复杂度为O(N)
        int[] aux = new int[r-l+1];
        int k = 0;
        int i = l;
        int j = mid;
        while (k < aux.length){
            while (i< mid && j<=r){
                if (arr[i] <= arr[j]){
                    aux[k++] = arr[i++];
                }else {
                    aux[k++] = arr[j++];
                }
            }
            //这两个while循环只会有一个被执行
            while (i < mid){
                aux[k++] = arr[i++];
            }
            while (j <= r){
                aux[k++] = arr[j++];
            }
        }
        for (k = 0; k < aux.length; k++,l++) {
            arr[l] = aux[k];
        }
    }

    // 递归使用归并排序,对arr[l...r]的范围进行排序
    private static void sort(int[] arr, int l, int r) {

        if (l >= r)
            return;

        int mid = (l+r)/2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid+1, r);
    }

    public static void sort(int[] arr){
        //函数重载呗
        sort(arr, 0, arr.length-1);
    }

    // 测试MergeSort
    public static void main(String[] args) {
        // Merge Sort是我们学习的第一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        // 注意：不要轻易尝试使用SelectionSort, InsertionSort或者BubbleSort处理100万级的数据
        // 否则，你就见识了O(n^2)的算法和O(nlogn)算法的本质差异：）
        int[] array = {1, 9, 10, 7, 13, 6, 5, 8, 9, 11};
        MergeSort.sort(array);
        System.out.println(Arrays.toString(array));
        return;
    }
}