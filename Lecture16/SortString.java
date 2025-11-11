package Lecture16;
import java.util.*;

public class SortString {
	static class pair {
		char ch;
		int freq;

		pair(char ch, int freq) {
			this.ch = ch;
			this.freq = freq;
		}

		@Override
		public String toString() {
			return "(" + ch + "," + freq + ")";
		}
	}

	public static void main(String[] args) {
		String s = "zz''AAcbb";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		List<pair> list = new ArrayList<>();

		for (char ch : map.keySet()) {
			list.add(new pair(ch, map.get(ch)));
		}

		System.out.println(list);

		Collections.sort(list, new Comparator<pair>() {
			@Override
			public int compare(SortString.pair o1, SortString.pair o2) {
				return o2.freq - o1.freq;
			}
		});
		System.out.println(list);

	}

}
