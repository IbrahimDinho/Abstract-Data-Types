package linearpkg.queuePkg;
// Queue Interface
public interface Queue{

	public int get() throws QueueEmptyException;

	public void put(int data);

	public int size();

	public boolean isEmpty();

	public void printQueue();
	

}