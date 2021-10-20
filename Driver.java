import linearpkg.listPkg.*;
import linearpkg.queuePkg.*;
import linearpkg.stackPkg.*;
import linearpkg.linkedPkg.*;
import nonlinearPkg.treePkg.*;

// class to Test DataStructures
public class Driver{
	/*
		because of Queue throw Exception
	**/ 
	public static void main(String[] args) throws Exception{
		LinkedList linkedList = new LinkedListImpl();
		LinkedListImpl l = new LinkedListImpl();
		l.append(5);
		l.append(6);
		linkedList.append(5);
		linkedList.append(7);
		linkedList.preappend(1);
		linkedList.printLinkedList();
		linkedList.reverseLinkedList();
		l.reverseLinkedlistRecursive();
		// linkedList.tailReverseLinkedListRecursive();
		l.printLinkedList();
		linkedList.printLinkedList();
		linkedList.insert(0,10);
		linkedList.insert(1,20);
		linkedList.insert(10,30);
		linkedList.printLinkedList();

		System.out.println(linkedList.get(0));
		System.out.println(linkedList.get(1));
		System.out.println(linkedList.get(60));
		System.out.println(linkedList.get(5));
		System.out.println(linkedList.get(6));

		List testList = new ListImpl();
		testList.append(1);
		testList.append(2);
		testList.append(3);

		for(int i=0; i<testList.size(); i++){
			System.out.println(testList.get(i));
		}

		System.out.println(testList.size());
		System.out.println(testList.remove(1));
		testList.set(1,20);

		for(int i=0; i<testList.size(); i++){
			System.out.println(testList.get(i));
		}

		Stack stack = new StackImpl();
		stack.append(35);
		stack.append(2);
		System.out.println(stack.size());

		System.out.println(stack.pop());
		System.out.println(stack.pop());


		Queue q = new QueueImpl();
		// try{
		// q.get();
		// }
		// catch(QueueEmptyException e){
		// 	System.out.println(e);
		// }

		q.put(1);
		q.put(2);
		q.put(3);
		q.put(4); 
		q.put(5); // Should be full now so resizes.
		q.put(6);

		System.out.println("size" + q.size());
		int sizeindex = q.size();

		for(int i=0; i < sizeindex; i++){
			System.out.println(q.get());
		}				

		

		// while(q.size() !=0){
		// 	System.out.println(q.get());
		// }

		System.out.println("Tree Test");
		Bst binaryTree = new BstImpl();
		binaryTree.insert(10);
		binaryTree.insert(9);
		binaryTree.insert(7);
		binaryTree.insert(13);
		binaryTree.insert(11);
		binaryTree.insert(3);
		binaryTree.insert(5);
		binaryTree.insert(20);
		binaryTree.insert(10);


		binaryTree.inOrder();
		binaryTree.levelOrder();
		System.out.println("Height of tree:" + binaryTree.heightOfTree());
		System.out.println("Contains 9" + binaryTree.contains(9));

		//Test PRINT Queue
		// Queue qu = new QueueImpl();
		// qu.put(1);
		// qu.put(2);
		// qu.put(3);
		// qu.put(4);
		// qu.put(4);

		// qu.printQueue();
		// qu.printQueue();


		// Test Queue for multithreaded use. (Thread safety)
		QueueImpl queue = new QueueImpl();
		queue.put(1);
		queue.put(2);
		queue.put(3);
		queue.put(4);
		queue.put(5);
		queue.put(10);
		queue.put(15);
		queue.put(20);
		



		MyThreadQ mt1 = new MyThreadQ("Child 1", queue);
		MyThreadQ mt2 = new MyThreadQ("Child 2", queue);


		try{
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch(InterruptedException exc){
			System.out.println("Main thread interruped");
		}
		System.out.println("Main thread going to terminate");
		queue.printQueue();
		


	}
}