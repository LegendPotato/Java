package algorithm;

import java.util.Arrays;

public class ShellSort {

	public static void sort(int[] arr) {
		int n = arr.length;
		int d = n / 2;
		while (d >= 1) {
			for (int i = d; i < n; i++) {
				int j = i;
				int temp = arr[i];
				for (; j >= d && temp < arr[j - d]; j -= d) {
					arr[j] = arr[j-d];
				}
				arr[j] = temp;
			}
			d/=2;
		}
	}
	public static void main(String[] args) {
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		ShellSort.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
