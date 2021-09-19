// Queue Interface
public interface Queue{

	public int get() throws QueueEmptyException;

	public void put(int data);

	public int size();

}