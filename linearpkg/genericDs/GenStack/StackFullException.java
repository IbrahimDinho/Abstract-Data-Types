// Exception for Stack Full errors
public class StackFullException extends Exception {

	private int size;

	StackFullException(int size){
		// size of stack passed in
		this.size = size;
	}

	@Override
	public String toString(){
		return "\n Stack Full, max size allowed is " + size;
	}
}