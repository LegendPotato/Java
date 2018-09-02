package Algorithm;
import java.util.Arrays;

public class MergeSort {

	private static void merge(int[] a, int low, int mid, int high) {
		//对a[low....mid]和a[mid+1....high]进行归并
		//拷贝待排序数组到中介数组中时，要考虑偏移量的问题，b[i-low]对应a[low]
		//因为low和high不一定是0和arrays.length
		int[] b = Arrays.copyOfRange(a, low, high + 1);
		//用两个指针来分别表示两个数组中的元素
		int i = low;
		int j = mid + 1;
		int k = low;
		//这种情况下保证两个子序列都有元素
		while (i <= mid && j <= high) {
			if (b[i - low] <= b[j - low]) {
				a[k++] = b[i - low];
				i++;
			} else {
				a[k++] = b[j - low];
				j++;
			}
		}
		//下面两种是 ：其中一个子序列已经全部归并，剩下另一个子序列还没有归并
		while (i <= mid) {
			a[k++] = b[i - low];
			i++;
		}
		while (j <= high) {
			a[k++] = b[j - low];
			j++;
		}
	}

	//对数组的[0到n-1]进行排序
	public static void sort(int[] a, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			//递归调用自己，拆分整个数组，直到最小
			sort(a, low, mid);
			sort(a, mid + 1, high);
			//归并的过程其实才是排序的过程
			merge(a, low, mid, high);
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 9, 2, 10, 6, 8, 4, 1, 9, 10 };
		MergeSort.sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

}
