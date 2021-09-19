package stackPkg;
//Implementation of stack

public class StackImpl implements Stack{

	private int[] arr;
	private int index;
	private final int ARRLENGTH = 10;
// Java fills unfilled values with zeros.
	public StackImpl(){
		this.index = 0;
		this.arr = new int[ARRLENGTH];

	}

	public int size(){
		return this.index;
	}
	public int pop(){
		if (index == 0){
			throw new IndexOutOfBoundsException();
		}
		
		
		return this.arr[--index];

	}

	public void append(int data){
		this.arr[index++] = data;

		if (index == arr.length){
			resize();

		}
		return;

	}

	private void resize(){
		int[] temp = new int[arr.length * 2];
		for(int i=0; i<arr.length; i++){
			temp[i] = arr[i];
		}
		this.arr = temp;
	}
}
