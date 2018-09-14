package AC.Meituan;

import java.util.Arrays;

public class MergeSort {

    static void sort(int[] array, int start, int end) {
        //边界条件，先考虑他是好习惯
        if (start == end) return;
        //归并排序是一个分治的算法，所以一定有递归，将大问题化小
        int mid = (end - start) / 2 + start;
        sort(array, start, mid);
        sort(array, mid + 1, end);
        //这个merge的过程是主要的排序过程
        merge(array, start, mid, end);

    }

    //排序的主过程
    static void merge(int[] array, int start, int mid, int end) {
        //新建一个临时数组，在临时数组中排序，最后copy到原数组
        int[] temp = new int[end - start + 1];
        //左序列指针
        int i = start;
        //右序列指针，注意是mid+1
        int j = mid + 1;
        //temp数组指针
        int t = 0;
        while (i <= mid && j <= end) {
            if (array[i] <= array[j]) {
                temp[t++] = array[i++];
            } else {
                temp[t++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = array[i++];
        }
        while (j <= end) {
            temp[j++] = array[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            array[k + start] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
