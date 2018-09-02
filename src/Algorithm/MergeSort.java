package Algorithm;
import java.util.Arrays;

public class MergeSort {

	private static void merge(int[] a, int low, int mid, int high) {
		//��a[low....mid]��a[mid+1....high]���й鲢
		//�������������鵽�н�������ʱ��Ҫ����ƫ���������⣬b[i-low]��Ӧa[low]
		//��Ϊlow��high��һ����0��arrays.length
		int[] b = Arrays.copyOfRange(a, low, high + 1);
		//������ָ�����ֱ��ʾ���������е�Ԫ��
		int i = low;
		int j = mid + 1;
		int k = low;
		//��������±�֤���������ж���Ԫ��
		while (i <= mid && j <= high) {
			if (b[i - low] <= b[j - low]) {
				a[k++] = b[i - low];
				i++;
			} else {
				a[k++] = b[j - low];
				j++;
			}
		}
		//���������� ������һ���������Ѿ�ȫ���鲢��ʣ����һ�������л�û�й鲢
		while (i <= mid) {
			a[k++] = b[i - low];
			i++;
		}
		while (j <= high) {
			a[k++] = b[j - low];
			j++;
		}
	}

	//�������[0��n-1]��������
	public static void sort(int[] a, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			//�ݹ�����Լ�������������飬ֱ����С
			sort(a, low, mid);
			sort(a, mid + 1, high);
			//�鲢�Ĺ�����ʵ��������Ĺ���
			merge(a, low, mid, high);
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 9, 2, 10, 6, 8, 4, 1, 9, 10 };
		MergeSort.sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

}
