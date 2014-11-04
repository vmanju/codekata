package trees;

import trees.BinaryTree;

public class isBinaryTreeBST {

    private static boolean isBST(BinaryTree<Integer> root){
    	if(root == null) return true;
        return isBSTHelper(root, root.getLeft(), root.getRight());
    }
    
    private static boolean isBSTHelper(BinaryTree<Integer> root, BinaryTree<Integer> left, BinaryTree<Integer> right){
        
        
        BinaryTree<Integer> leftNode = root.getLeft();
        BinaryTree<Integer> rightNode = root.getRight();
        
        if(leftNode == null || rightNode == null) return true;
        
        if(root.getData() >= max(leftNode) && root.getData() <= min(rightNode)) {
            return isBSTHelper(leftNode, leftNode.getLeft(), leftNode.getRight())
                   && isBSTHelper(rightNode, rightNode.getLeft(), rightNode.getRight());
        }
        
        return false;
    }
    
    private static Integer max(BinaryTree<Integer> node){
        while(node.getRight()!=null){
            node = node.getRight();
        }
        return node.getData();
    }
    
    private static Integer min(BinaryTree<Integer> node){
        while(node.getLeft()!=null){
            node = node.getLeft();
        }
        return node.getData();
    }
    
    public static void main(String[] args){
        BinaryTree<Integer> root = new BinaryTree<>(3);
        root.setLeft(new BinaryTree<>(2));
        root.getLeft().setLeft(new BinaryTree<>(1));
        root.setRight(new BinaryTree<>(5));
        root.getRight().setLeft(new BinaryTree<>(4));
        root.getRight().setRight(new BinaryTree<>(6));
        
        // should output true.
        assert isBST(root);
        System.out.println(isBST(root));
        
        root.setData(10);
        // should output false.
        assert !isBST(root);
        System.out.println(isBST(root));
        // should output true.
        assert isBST(null);
        System.out.println(isBST(null));
    }
}