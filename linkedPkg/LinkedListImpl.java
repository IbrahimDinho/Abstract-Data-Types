package linkedPkg;
public class LinkedListImpl implements LinkedList {
	Node head;
	/*
	Reverse LINKED LIST in 2 ways iteratively and recursively.!!! Also make a new class doubly Linked LIST DATA STRUCTURE!!! when you can
	make more like arraylist and doubly linked data structures
	*/
	// methods
	public void append(int data){
		if (this.head == null)
			this.head = new Node(data);
		else {
			Node current = this.head;
			while (current.next != null){
				current = current.next;
			}
			current.next = new Node(data);
		}
	}

	public void preappend(int data){
		if (this.head == null)
			this.head = new Node(data);
		else{
			Node temp = this.head;
			this.head = new Node(data);
			head.next = temp;
		}
	}
	public void deleteWithValue(int data){
		if (head == null) return;
		if (head.data == data){
			head = head.next;
			return;
		}
		Node current = head.next;
		Node prev = head;

		while (current != null){
			if (current.data == data){
				prev.next = current.next;
				return;
			}
			else {
				prev.next = current;
				current = current.next;
			}
		}
	}
	public void printLinkedList(){
		Node current = this.head;
		while(current != null){
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println("");

	}

	public int get(int pos){
		int counter = 0;
		Node current = this.head;
		while (current != null){
			if (pos == counter){
				return current.data;
			}
			else{
				current = current.next;
				counter++;
			}
		}
		// no position exists.
		return -1;
	}

	// insert at position, where 0 is start
	public void insert(int pos, int data){
		if (pos == 0){
			preappend(data);
			return;
		}

		Node newNode = new Node(data);
		Node prev = this.head;
		Node current = prev;
		int counter = 0;
		while(current != null){
			current = current.next;
			counter++;
			if (counter == pos){
				prev.next = newNode;
				newNode.next = current;
				return;
			}
			else{
				if (prev.next != null){
				prev = prev.next;
			}
			}
		}
		//Position larger then linkedlist so add to end
		prev.next = newNode;
		return;
	}
	public void reverseLinkedList(){
		// if (this.head == null)
		// 	return;
		Node prev = null;
		Node current = head;
		while (current != null){
			Node temp = current.next;
			current.next = prev;
			// move pointers be careful must move previous to current first
			prev = current;
			current = temp;
			

		}
		this.head = prev;
	}

	// reverseLinkedlist recursively HEAD RECURSION
	// HEAD RECURSION BELOW THIS IS TAIL
	public void reverseLinkedlistRecursive(){
		if (this.head == null) return;
		Node newEnd = reverseLinkedlisthelper(this.head);
		newEnd.next = null;
	}
	private Node reverseLinkedlisthelper(Node current){
		// head could start at null so current == null used and || shortcut so other doesnt run in that case otherwise 2nd runs all the time
		if (current.next == null){
			this.head = current; // new head end of list
			return current;
		}
		Node ptr_ahead = reverseLinkedlisthelper(current.next); // get to end of list
		ptr_ahead.next = current;
		return current;


		// TAIL RECURSION similar to for loop and iterative method i did above!! nothing is done coming back from recursive stack!
	}
	public void tailReverseLinkedListRecursive(){
		Node current = this.head;
		Node prev = null;
		reverseUtil(prev,current);
		return;
	}

	private void reverseUtil(Node prev, Node current){
		//empty linkedlist
		if (current == null)
			return;
		// at end node
		if (current.next == null){
			this.head = current;
			current.next = prev;
			return;
		}
		// change direction
		Node temp = current.next;
		current.next = prev;
		// move pointers
		prev = current;
		current = temp;

		reverseUtil(prev, current);
		return;
	}	
}

class Node {
	Node next;
	int data;

	public Node(int data){
	this.data = data;
	}
}
	

