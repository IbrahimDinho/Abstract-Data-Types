public class Driver{
	public static void main(String[] args){
		LinkedList linkedList = new LinkedList();
		linkedList.append(5);
		linkedList.append(7);
		linkedList.preappend(1);
		linkedList.printLinkedList();
		// linkedList.reverseLinkedList();
		// linkedList.reverseLinkedlistRecursive();
		linkedList.tailReverseLinkedListRecursive();
		linkedList.printLinkedList();

	}
}