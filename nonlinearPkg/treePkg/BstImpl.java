package nonlinearPkg.treePkg;

// import linearpkg.queuePkg.*;
import java.util.*;


// Binary Search Tree implementation
public class BstImpl implements Bst{
	Node root;

	public void insert(int data){

		Node newNode = new Node(data);

		if (this.root == null){
			this.root = newNode;
			return;
		}
		//else if BST not empty use auxillary method
		insertAux(this.root, newNode);
		return;



	}
	// Auxillary function for recursive call.
	private void insertAux(Node ptr, Node newNode){

		if (newNode.data < ptr.data){
			if (ptr.left == null){
				ptr.left = newNode;
			}
			else{
				insertAux(ptr.left, newNode);
			}
		}
		// to right of tree
		else{
			if (ptr.right == null){
				ptr.right = newNode;
			}
			else {
				insertAux(ptr.right, newNode);
			}
		}
	}

	public boolean contains(int data){

		if (this.root == null) return false;

		Node ptr = this.root;

		while (ptr != null){
			if (ptr.data == data) return true;
			else if (data < ptr.data) {
				ptr = ptr.left;
			}
			else{
				ptr = ptr.right;
			}
		}
		return false;
	}

	public void inOrder(){
		// Tree traversal Left Root Right
		// Use aux method
		if (this.root == null){
			System.out.println("Tree is empty");
			return;
		}
		inOrderAux(this.root);

	}
	private void inOrderAux(Node ptr){

		if (ptr.left != null) {
			inOrderAux(ptr.left);
		}
		System.out.println(ptr.data);

		if (ptr.right != null) {
			inOrderAux(ptr.right);
		}
	}

	// print root then left then right
	public void preOrder(){

		if (this.root == null){
			System.out.println("Tree is empty");
			return;
		}
		preOrderAux(this.root);
	}

	private void preOrderAux(Node ptr){

		System.out.println(ptr.data);

		if (ptr.left != null) {
			preOrderAux(ptr.left);
		}

		if (ptr.right != null) {
			preOrderAux(ptr.right);
		}

	}

	// print left then right then root.
	public void postOrder(){

		if (this.root == null){
			System.out.println("Tree is empty");
			return;
		}
		postOrderAux(this.root);
	}

	private void postOrderAux(Node ptr){

		if (ptr.left != null) {
			postOrderAux(ptr.left);
		}

		if (ptr.right != null) {
			postOrderAux(ptr.right);
		}

		System.out.println(ptr.data);


	}

	// breadth first search traversal of tree USE of Queue From Java Collections
	public void levelOrder(){
		if (this.root == null) return; // return TreeEmptyException
		Queue<Node> queue=new LinkedList<>();
    	queue.add(this.root);

    	while(!queue.isEmpty()) {
        	Node tempNode=queue.poll();
        	System.out.print(tempNode.data+" ");
        	if(tempNode.left!=null)
            queue.add(tempNode.left);
        	if(tempNode.right!=null)
            queue.add(tempNode.right);
    } 
		}

	public int heightOfTree(){

		if(this.root == null) return -1; // return exception TreeEmptyException

		// Aux method for recursion
		int height = heightOfTreeAux(this.root);
		return height;
	}

	private int heightOfTreeAux(Node ptr){

		if (ptr == null) {
			return - 1;
		}
		int leftHeight = heightOfTreeAux(ptr.left);
		int rightHeight = heightOfTreeAux(ptr.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}
}

// class Accessible only within package
class Node {
	Node left, right;
	int data;

	public Node(int data){
		this.data = data;
	}
}