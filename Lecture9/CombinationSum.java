package Lecture9;
import java.util.*;

public class CombinationSum {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		int target = 7;
		List<Integer> list = new ArrayList<>();
		solve(arr, target, list, 0);
	}

	private static void solve(int[] arr, int target, List<Integer> list, int idx) {
		if (target == 0) {
			System.out.println(list);
			return;
		}

		if (target < 0) {
			return;
		}

		for (int i = idx; i < arr.length; i++) {
			list.add(arr[i]);
			solve(arr, target - arr[i], list, i);
			list.remove(list.size() - 1);
		}

	}

}
