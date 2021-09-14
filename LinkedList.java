public interface LinkedList {
	//Add to end of linkedlist
	public void append(int data);

	//Add to beginning of linkedlist
	public void preappend(int data);

	//delete by integer value of node
	public void deleteWithValue(int data);

	// print full list
	public void printLinkedList();

	// reverse list
	public void reverseLinkedList();

	// insert data at given position
	public void insert(int pos, int data);

	// get data at given position
	public int get(int pos);




}
