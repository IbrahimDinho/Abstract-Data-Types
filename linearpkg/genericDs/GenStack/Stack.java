//	A Generic Stack.
public interface Stack<T> {

	public T pop() throws StackEmptyException;

	public void push(T obj) throws StackFullException;

	public int size();
}