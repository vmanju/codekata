package trees;

public class SecondLargest {

	public static BinaryTree<Integer> getLargest(BinaryTree<Integer> node){
		if(node.getRight()!=null)
			getLargest(node.getRight());
		return node;
	}
	
	public static BinaryTree<Integer> getSecondLargest(BinaryTree<Integer> node) {
		if(node==null) return null;

		while(node!=null){
			if(node.getRight()!=null){
				if(node.getRight().getRight()==null){
					// largest in left subtree is second largest
					if(node.getRight().getLeft()!=null){
						return getLargest(node.getRight().getLeft());
					}
					// return the parent as second largest
					else {
						return node;
					}
				}
			}
			node = node.getRight();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree<Integer> root = new BinaryTree<>(5);
        root.setLeft(new BinaryTree<>(3));
        root.getLeft().setLeft(new BinaryTree<>(2));
        root.setRight(new BinaryTree<>(13));
        //root.getRight().setLeft(new BinaryTree<>(12));
        //root.getRight().setRight(new BinaryTree<>(14));
        
        System.out.println(getSecondLargest(root).getData());
	}

}
