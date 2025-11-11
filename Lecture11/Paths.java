package Lecture11;

import java.util.*;

public class Paths {
	static void paths(int r, int c, String path, List<String> out) {
		if (r == 0 && c == 0) {
			out.add(path);
			return;
		}
		if (r > 0)
			paths(r - 1, c, path + "V", out);
		if (c > 0)
			paths(r, c - 1, path + "H", out);
	}

	public static void main(String[] args) {
		int rows = 3, cols = 3;
		List<String> res = new ArrayList<>();
		paths(rows - 1, cols - 1, "", res);
		for (String s : res)
			System.out.println(s);
		System.out.println("Count = " + res.size());
	}
}
