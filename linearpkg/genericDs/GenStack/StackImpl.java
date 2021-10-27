public class StackImpl<T> implements Stack<T> {

	//Underlaying data Structure is array
	private T[] arr;
	private Object[] elementData;

	// Index at the top of stack
	int putIndex;


	// default array size if not specified
	private final int DEFAULTSIZE = 10;

	// construct array of default size 10
	StackImpl(){
		// initialise generic array if no array passed or size given
		this.elementData = new Object[DEFAULTSIZE];
		arr = (T[]) this.elementData;

		putIndex = 0;
	}

	// Construct stack using size given by user.
	StackImpl(int size){
		this.elementData = new Object[size];
		arr = (T[]) this.elementData;

		putIndex = 0;
	}

	// Construct stack from array passed in.
	StackImpl(T[] ob){
		arr = ob;

		putIndex = 0;
	}


	//Construct stack with initial values from Array a.
	StackImpl(T[] ob, T[] a){
		arr = ob;

		for(int i=0; i < a.length; i++){
			try{
				push(a[i]);
			}
			catch(StackFullException e){
				System.out.println(e);
			}
		}
	}

	// pop object from stack
	public T pop() 
	throws StackEmptyException{

		if (putIndex <= 0){
			//throw stack empty exception
			throw new StackEmptyException();

		}

		return arr[--putIndex];
	}

	// push object onto stack
	public void push(T obj) 
	throws StackFullException{

		if (putIndex >= arr.length){
			//Throw stack full exception
			throw new StackFullException(arr.length);
		}
		arr[putIndex++] = obj;
		return; 

	}

	public int size(){
		return putIndex;
	}
}