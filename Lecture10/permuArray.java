package Lecture10;
import java.util.ArrayList;
import java.util.List;

public class permuArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		boolean[] visited = new boolean[arr.length];
		List<Integer> list = new ArrayList<>();
		solve(arr, list, visited);
	}

	private static void solve(int[] arr, List<Integer> list, boolean[] visited) {
		if (list.size() == arr.length) {
			System.out.println(list);
			return;
		}

		for (int i = 0; i < arr.length; i++) {

			if (visited[i] == true)
				continue;

			list.add(arr[i]);
			visited[i] = true;
			solve(arr, list, visited);
			visited[i] = false;

			list.remove(list.size() - 1);
		}
	}

}
