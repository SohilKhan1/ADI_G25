package Lecture2;

public class TreeClient {
	public static void main(String[] args) {
		Tree tt = new Tree();
		tt.createTree();
		tt.preorder();
		System.out.println(tt.max());

	}

}

//20 true 10 true 30 false false true 70 false false true 40 false false