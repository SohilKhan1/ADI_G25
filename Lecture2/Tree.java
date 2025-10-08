package Lecture2;

import java.util.*;

public class Tree {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;

		public Node(int val) {
			this.data = val;
		}
	}

	private Node root;

	public void createTree() {
		this.root = createTree(root);
	}

	private Node createTree(Node root) {
		int val = sc.nextInt();
		Node nn = new Node(val);

		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nn.left = createTree(nn);
		}

		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			nn.right = createTree(nn);
		}

		return nn;
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);

	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node root) {
		if (root == null) {
			return;
		}
		preorder(root.left);
		preorder(root.right);
		System.out.println(root.data);
	}

	public void inorder() {
		inorder(this.root);
	}

	private void inorder(Node root) {
		if (root == null) {
			return;
		}
		preorder(root.left);
		System.out.println(root.data);
		preorder(root.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node root) {

		if (root == null)
			return 0;

		int a = root.data;
		int left = max(root.left);
		int right = max(root.right);

		return Math.max(a, Math.max(left, right));
	}

}

// 20 true 10 true 30 false false true 70 false false true 40 false false 
