package Algorithm;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] arr) {
	    //从头开始循环
		for (int i = 0; i < arr.length; i++) {
		    //从尾开始循环
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {


		int[] arr2 = {1, 9, 10, 7, 3, 6, 5, 3, 9, 1 };

		BubbleSort.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
	}

}
