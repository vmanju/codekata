package interviewcake;
public class BSTChecker {

	private static boolean isBSTHelper(Node node, int min, int max) {
		if (node == null)
			return true;

		if (node.data > max || node.data < min)
			return false;

		return isBSTHelper(node.left, min, node.data)
				&& isBSTHelper(node.right, node.data, max);

	}

	private static boolean isBST(Node node) {
		return isBSTHelper(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		Node node = new Node(2);
		root.left = node;
		root.right = new Node(7);

		node.left = new Node(1);
		node.right = new Node(5);

		System.out.println(isBST(root));
	}

}
