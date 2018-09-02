package Algorithm;

import java.util.Arrays;

public class InsertionSort {

	public static void sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			for (; j > 0 && arr[j - 1] > temp; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {

		int[] arr2 = { 3, 9, 6, 10, 6, 5, 8, 3, 1, 1 };

		InsertionSort.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		;
	}

}
