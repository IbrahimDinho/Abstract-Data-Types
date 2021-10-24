/*
Simple Generic Queue of fixed size
**/
public class QueueImpl<T> implements Queue<T> {
	
	// Default array size if not specified.
	private final int DEFAULTARRAYSIZE = 10;
	// underlaying DS that is generic
	private T[] arr;
	Object[] elementData;
	// get and put index
	private int putIndex;
	private int getIndex;

	// Multiple constructors

	// This constructor makes an array of size 10 by default
	public QueueImpl(){
		this.elementData = new Object[DEFAULTARRAYSIZE];
		arr = (T[]) this.elementData;
		putIndex = getIndex = 0;

	}

	// this constructor creates an array where size is of your choosing
	public QueueImpl(int size){
		this.elementData = new Object[size];
		arr = (T[]) this.elementData;
		putIndex = getIndex = 0;

	}

	//construct a queue from an empty array
	public QueueImpl(T[] ob){
		arr = ob;
		putIndex = getIndex = 0;
	}


	@Override
	public void put(T obj) throws QueueFullException{
		if (putIndex == arr.length) throw new QueueFullException(arr.length);

		arr[putIndex++] = obj;
		return;
	}

	@Override
	public T get() throws QueueEmptyException{

		if (putIndex == getIndex) throw new QueueEmptyException();

		return arr[getIndex++];
	}

	@Override
	public int size(){
		return putIndex;
	}

}