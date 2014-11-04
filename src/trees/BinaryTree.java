package trees;


	public class BinaryTree<T> {
	
	    private T data;
	    private BinaryTree<T> left, right;
	    
	    public BinaryTree(T data){
	        this.data = data; 
	    }
	    
	    public T getData(){
	        return this.data;
	    }
	    
	    public BinaryTree<T> getLeft(){
	        return this.left;
	    }
	    
	    public BinaryTree<T> getRight(){
	        return this.right;
	    }
	    
	    public void setData(T data){
	        this.data = data;
	    }
	    
	    public void setLeft(BinaryTree<T> left){
	        this.left = left;
	    }
	    
	    public void setRight(BinaryTree<T> right){
	        this.right = right;
	    }
	}
