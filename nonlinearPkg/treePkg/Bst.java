package nonlinearPkg.treePkg;
// Binary Search Tree Interface
public interface Bst {

	// insert so is binary search tree
	public void insert(int data);

	// contains...
	public boolean contains(int data);

	// Depth first search
	public void inOrder();
	public void preOrder();
	public void postOrder();

	//breadth first search
	public void levelOrder();

	// Get height of binary tree
	public int heightOfTree();


}
