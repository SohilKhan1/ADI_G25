package Lecture15;
import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int[] arr = { 10, 40, 20, 30, 50 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		int n = arr.length;

		// create heap
		for (int i = n; i >= 0; i--) {
			heapefy(arr, n, i);
		}
		System.out.println(Arrays.toString(arr));

		// remove first element & swap with last
		
		for(int i=n-1;i>=0;i--) {
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapefy(arr, i, 0);
		}
	}

	private static void heapefy(int[] arr, int n, int i) {
		int pi = i;
		int max = pi;
		while (true) {
			int lc = 2 * pi + 1;
			int rc = 2 * pi + 2;

			if (lc < n && arr[lc] > arr[pi]) {
				max = lc;
			}
			if (rc < n && arr[rc] > arr[max]) {
				max = rc;
			}
			if (max == pi) {
				break;
			}
			int temp = arr[pi];
			arr[pi] = arr[max];
			arr[max] = temp;
			pi = max;
		}
	}

}
