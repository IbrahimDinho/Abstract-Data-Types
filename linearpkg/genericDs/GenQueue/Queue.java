
public interface Queue<T> {

	public void put(T obj) throws QueueFullException;

	public T get() throws QueueEmptyException;

	public int size();
}