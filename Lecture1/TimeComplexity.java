package Lecture1;

public class TimeComplexity {
	public static void main(String[] args) {
//---------------------------------------------------------------------
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
////---------------------------------------------------------------------
		int n = 1000;
		for (int i = 0; i < n; i++) {
			System.out.println("Hello");
		}
////---------------------------------------------------------------------
		int i = 0;
		while (i < n) {
			System.out.println("Hello");
			i++;
		}
////---------------------------------------------------------------------
		while (i < n) {
			System.out.println("Hello");
			i = i * 2;
		}
////---------------------------------------------------------------------
		while (n > 0) {
			System.out.println("Hello");
			n /= 2;
		}
////---------------------------------------------------------------------
		n=100;
		i=0;
		while (i <= n) {
			System.out.println("Hello");
			i += 2;
			i += 3;
		}
////---------------------------------------------------------------------
		i = 1;
		n = 1000;
		while (i <= n) {
			System.out.println("Hello");
			i *= 2;
			i *= 3;
		}
////---------------------------------------------------------------------
//		n = 100;
//		while (n > 1) {
//			System.out.println("Hello");
//			n /= 2;
//			n /= 3;
//		}
////---------------------------------------------------------------------
		int k = 5;
		while (i <= n) {
			System.out.println("Hello");
			i += k;
		}
////---------------------------------------------------------------------
		k=2;
		while (i <= n) {
			System.out.println("Hello");
			i *= k;
		}
////---------------------------------------------------------------------
		while (n > 0) {
			System.out.println("Hello");
			n = n - 1;
		}
////---------------------------------------------------------------------
//		while (n > 0) {
//			System.out.println("Hello");
//			n = n - 2;
//			n = n - 3;
//		}
////---------------------------------------------------------------------
		while (n > 0) {
			n = n - k;
		}
////---------------------------------------------------------------------
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("Hello");
			}
		}
////---------------------------------------------------------------------
//
		for (i = 1; i * i <= n; i++) {
			System.out.println("Hello");
		}
////---------------------------------------------------------------------
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k1 = 1; k1 <= n; k1++) {
				}
			}
		}
////---------------------------------------------------------------------
//		for (i = 1; i <= n; i++) {
//			for (int j = 1; j <= i * i; j++) {
//				for (int k1 = 1; k1 <= n / 2; k1++) {
//					System.out.println("Hello");
//				}
//			}
//		}
////---------------------------------------------------------------------
		for (i = 1; i <= n; i *= 2) {
			System.out.println("Hello");
		}
////---------------------------------------------------------------------
		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (int k1 = 1; k1 <= n; k1 = k1 * 2) {
					System.out.println("Hello");
				}
			}
		}
////---------------------------------------------------------------------

		// DYS
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("Hello");
			}
		}

		int[] arr = new int[5];
		bubbleSort(arr);
	}

////---------------------------------------------------------------------
//	}
//
//	public int linearSearch(int[] array, int target) {
//		int n = array.length;
//		for (int i = 0; i < n; i++) {
//			if (array[i] == target) {
//				return i;
//			}
//		}
//		return -1;
//	}
//
////---------------------------------------------------------------------
	public int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
//---------------------------------------------------------------------

	public static void bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true;
				}
				if (!flag) {
					break;
				}
			}
		}
	}

//---------------------------------------------------------------------

	public void selectionSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;

			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[min_idx])
					min_idx = j;
			}

			int temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
		}
	}

//---------------------------------------------------------------------

	public void insertionSort(int[] array) {
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

}
