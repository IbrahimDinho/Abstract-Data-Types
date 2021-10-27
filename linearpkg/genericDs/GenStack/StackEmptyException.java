// Exception for Stack Empty errors
public class StackEmptyException extends Exception{

	@Override
	public String toString(){
		return "\n Stack is Empty";
	}
}