// class to Test DataStructures
public class Driver{
	/*
		For Queue DEMO throw Exception
	**/ 
	public static void main(String[] args) throws Exception{
		// LinkedList linkedList = new LinkedListImpl();
		// LinkedListImpl l = new LinkedListImpl();
		// l.append(5);
		// l.append(6);
		// linkedList.append(5);
		// linkedList.append(7);
		// linkedList.preappend(1);
		// linkedList.printLinkedList();
		// linkedList.reverseLinkedList();
		// l.reverseLinkedlistRecursive();
		// // linkedList.tailReverseLinkedListRecursive();
		// l.printLinkedList();
		// linkedList.printLinkedList();
		// linkedList.insert(0,10);
		// linkedList.insert(1,20);
		// linkedList.insert(10,30);
		// linkedList.printLinkedList();

		// System.out.println(linkedList.get(0));
		// System.out.println(linkedList.get(1));
		// System.out.println(linkedList.get(60));
		// System.out.println(linkedList.get(5));
		// System.out.println(linkedList.get(6));

		// List testList = new ListImpl();
		// testList.append(1);
		// testList.append(2);
		// testList.append(3);

		// for(int i=0; i<testList.size(); i++){
		// 	System.out.println(testList.get(i));
		// }

		// System.out.println(testList.size());
		// System.out.println(testList.remove(1));
		// testList.set(1,20);

		// for(int i=0; i<testList.size(); i++){
		// 	System.out.println(testList.get(i));
		// }

		// Stack stack = new StackImpl();
		// stack.append(35);
		// stack.append(2);
		// System.out.println(stack.size());

		// System.out.println(stack.pop());
		// System.out.println(stack.pop());


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

		System.out.println("package works");



	}
}