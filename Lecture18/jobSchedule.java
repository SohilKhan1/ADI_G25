package Lecture18;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class jobSchedule {
	static class pair {
		int d;
		int v;

		pair(int d, int v) {
			this.d = d;
			this.v = v;
		}

		public String toString() {
			return "(" + d + "," + v + ")";
		}
	}

	public static void main(String[] args) {
		int[] delay = { 2, 1, 3, 13, 4 };
		int[] values = { 15, 25, 20, 40, 20 };

		ArrayList<pair> list = new ArrayList<>();

		for (int i = 0; i < values.length; i++) {
			pair p = new pair(delay[i], values[i]);
			list.add(p);
		}
		System.out.println(list);
		list.sort(new Comparator<pair>() {
			@Override
			public int compare(pair o1, pair o2) {
				return o2.v - o1.v;
			}
		});
		System.out.println(list);

		int total = 0;
		int[] visited = new int[list.size() + 1];

		for (int i = 0; i < list.size(); i++) {
			pair p = list.get(i);
			int start = p.d;
			start = Math.min(start, list.size()-1);
			while (start >= 0) {
				if (visited[start] == 0) {
					visited[start] = 1;
					total += p.v;
					break;
				}
				start--;
			}
		}
		System.out.println(total);

	}

}
