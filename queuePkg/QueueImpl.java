package queuePkg;

// Queue Implementation for a dynamic circular Queue

public class QueueImpl implements Queue{

	private final int ARRLENGTH = 4;

	private int getIndex;
	private int putIndex;
	private int size;
	private int[] arr;

	public QueueImpl(){
		this.arr = new int[ARRLENGTH + 1];
		getIndex = putIndex = size = 0;
	}

	// get from Front of Queue
	public int get() throws QueueEmptyException{
		if (getIndex == putIndex){
			throw new QueueEmptyException();
		}
		int value = arr[getIndex++];
		this.size--;
		if (getIndex == arr.length){
			getIndex = 0;
		} 

		return value;

	}

	// Put data to back of Queue
	public void put(int data){
		// if Queue Full then resize
		// This can occur when underlaying array is full or Put pointer just before get pointer
		if ((putIndex == arr.length - 1 & getIndex == 0) | putIndex+1 == getIndex ){
			resize();
		}
		arr[putIndex++] = data;
		this.size++;
	
		//Loop back once reached end of Queue
		if(putIndex == arr.length){
			putIndex = 0;
		}

		return;
	}

	public int size(){
		return this.size;
	}

	//resize Queue so its dynamic

	private void resize(){
		int[] temp = new int[arr.length * 2];
		for(int i=0; i<arr.length; i++){
			temp[i] = arr[i];
		}
		this.arr = temp;

	}
}
