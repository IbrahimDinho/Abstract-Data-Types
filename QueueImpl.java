// Queue Implementation for a dynamic circular Queue

public class QueueImpl{

	private final int ARRLENGTH = 10;

	private int getIndex;
	private int putIndex;
	private int size;
	private int[] arr;

	QueueImpl(){
		this.length = 0;
		this.arr = new arr[ARRLENGTH];
		getIndex = putIndex = 0;
	}


	public int get() throws QueueEmptyException{
		if (getIndex == putIndex){
			throw new QueueEmptyException();
		}
		int value = arr[getIndex++];
		if (getIndex == arr.length) getIndex = 0; //loop back

		return value;

	}

	public void put(int data){
		// if Queue Full then resize
		// This can occur when underlaying array is full or Put pointer just before get pointer
		if ((putIndex == arr.length && getIndex == 0) | putIndex == getIndex ){
			resize();
		}
		arr[putIndex++] = data;
		// need to be careful here as usually you have +1 empty
		//Loop back once reached end of Queue
		if(putIndex == arr.length) putIndex = 0;

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