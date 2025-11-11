package Lecture14;
import java.util.*;

public class heap {
	List<Integer> list = new ArrayList<Integer>();

	public int parent(int ci) {
		return (ci - 1) / 2;
	}

	public void swap(int ci, int pi) {
		int v1 = list.get(pi);
		int v2 = list.get(ci);
		list.set(ci, v1);
		list.set(pi, v2);
	}

	public void insert(int data) {
		list.add(data);
		int ci = list.size() - 1;

		while (ci > 0 && list.get(ci) < list.get(parent(ci))) {
			swap(ci, parent(ci));
			ci = parent(ci);
		}
	}

	public int get() {
		int ans = list.get(0);
		int last = list.remove(list.size() - 1);
		if (list.size() != 0) {
			list.set(0, last);
			int pi = 0;
			int min = pi;
			while (true) {
				int lc = 2 * pi + 1;
				int rc = 2 * pi + 2;

				if (lc < list.size() && list.get(lc) < list.get(pi)) {
					min = lc;
				}
				if (rc < list.size() && list.get(rc) < list.get(min)) {
					min = rc;
				}
				if (min == pi) {
					break;
				}
				swap(pi, min);
				pi = min;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		heap h = new heap();
		h.insert(10);
		h.insert(20);
		h.insert(30);
		h.insert(40);
		System.out.println(h.get());
		System.out.println(h.get());
	}
}
