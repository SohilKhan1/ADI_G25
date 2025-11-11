package Lecture18;
import java.util.*;

public class FractionalKnapsack {
	static class pair {
		int w;
		int v;
		double r;

		pair(int w, int v) {
			this.w = w;
			this.v = v;
			r = (v * 1.0) / w;
		}

		public String toString() {
			return "(" + w + "," + v + "," + r + ")";
		}
	}

	public static void main(String[] args) {
		int[] weight = { 10, 20, 20, 10 };
		int[] value = { 100, 100, 200, 300 };
		int mw = 40;

		List<pair> list = new ArrayList<>();

		for (int i = 0; i < value.length; i++) {
			pair pp = new pair(weight[i], value[i]);
			list.add(pp);
		}
		System.out.println(list);

		Collections.sort(list, new Comparator<pair>() {
			@Override
			public int compare(pair o1, pair o2) {
				return (int) (o2.r - o1.r);
			}
		});
		System.out.println(list);
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			pair p = list.get(i);
			if (mw >= p.w) {
				total = total + p.v;
				mw = mw - p.w;
				if (mw <= 0) {
					break;
				}
			} else {
				total = total + (int) (mw * p.r);
				mw = mw - p.w;
				if (mw <= 0) {
					break;
				}
			}

		}
		System.out.println(total);

	}

}
