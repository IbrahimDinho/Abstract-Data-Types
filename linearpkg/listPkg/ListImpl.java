package linearpkg.listPkg;

public class ListImpl implements List{ 

	private final int ARRLENGTH = 10;
	private int index;
	private int arr[];

	public ListImpl(){
		this.index = 0;
		this.arr = new int[ARRLENGTH];
	}

	private void resize(){
		int[] temp = new int[arr.length * 2];
		for(int i=0; i<arr.length; i++){
			temp[i] = arr[i];
		}
		this.arr = temp;
	}

	public int get(int pos){
	try{
		return this.arr[pos];
	}
	catch(IndexOutOfBoundsException e){
		System.out.println("Index out of range" + e);
		// return last element instead
		return this.arr[index];
	}
	}

	public void append(int data){
		this.arr[index++] = data;
		if (index == arr.length){
			resize();

		}
		return;
	}


	public int size(){
		return this.index;
	}

	public int remove(int pos){
		if (pos >= arr.length || pos > this.index){
			// unchecked exception so no need to declare in method header
			throw new IndexOutOfBoundsException();
		}
		int[] tmp = new int[arr.length];
		int j = 0;
		for (int i=0; i<arr.length; i++){
			if (i != pos){
				tmp[j++] = this.arr[i];
			}
		}
		int obj = this.arr[pos];
		this.arr = tmp;
		this.index--;
		return obj;
	}

	public int remove(){
		int obj = this.arr[index];
		this.index--;
		return obj;
	}
	public void set(int pos, int element){
		if (pos >= arr.length || pos > this.index){
			throw new IndexOutOfBoundsException();
		}

		this.arr[pos] = element;
		return;



	}

}
