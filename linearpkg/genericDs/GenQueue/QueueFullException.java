
public class QueueFullException extends Exception {

	int size;

	QueueFullException(int size){
		this.size = size;
	}

	public String toString(){
		return "\nQueue is full, max size is " + size;
	}
}