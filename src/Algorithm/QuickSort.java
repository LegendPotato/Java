package Algorithm;

import java.util.Arrays;

public class QuickSort {

	//普通快速排序，关键在partition这一步
	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		while (low < high) {
			while (low < high && a[high] >= pivot) high--;
			a[low] = a[high];
			while (low < high && a[low] <= pivot) low++;
			a[high] = a[low];
		}
		a[low] = pivot;
		return low;

	}

	private static void sort(int[] a, int low, int high) {
		if (low < high) {
			int pivotLoc = partition(a, low, high);
			sort(a, low, pivotLoc - 1);
			sort(a, pivotLoc + 1, high);
		}
	}


	public static void main(String[] args) {
		int[] a = { 10, 9, 2, 10, 6, 8, 4, 1, 9, 10 };

		QuickSort.sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));

	}
}
