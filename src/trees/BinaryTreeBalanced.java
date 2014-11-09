package trees;

public class BinaryTreeBalanced {

	
	private static int height(Node node){	
		if(node==null) return 0;
		return  1 + Math.max(height(node.left),height(node.right));
	}
	
	private static boolean isBinaryTreeBalanced(Node node){
		int left_height = height(node.left);
		int right_height = height(node.right);
		
		return Math.abs(left_height - right_height) <=1 &&
				isBinaryTreeBalanced(node.left) &&
				isBinaryTreeBalanced(node.right);
	}
	
	/*private static boolean isBinaryTreeBalanced2(Node node){
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(3);
		root.right.left = new Node(2);
		root.right.right = new Node(1);
		root.right.left.right = new Node(6);
		
		System.out.println(isBinaryTreeBalanced(root));
	}

}

class Node {
	int val;
	Node left;
	Node right;
	
	public Node(int val){
		this.val = val;
		left = null;
		right = null;
	}
}
