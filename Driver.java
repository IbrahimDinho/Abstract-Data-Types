// class to Test DataStructures
public class Driver{
	public static void main(String[] args){
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






	}
}