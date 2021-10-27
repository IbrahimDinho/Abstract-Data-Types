import java.util.logging.Logger;

//Demonstrate generic stack class
public class SDemo {

	// Test Stack using logger
		private static final Logger logger = Logger.getLogger(SDemo.class.getName());


	public static void main(String[] args){


		logger.info("Begin Logging");
		
		// Different Stack Initalisation
		Stack<Integer> s1 = new StackImpl<>();
		Stack<Integer> s2 = new StackImpl<>(5);

		//Stack created from Array
		String[] stringStack = new String[5];
		Stack<String> s3 = new StackImpl<>(stringStack);
		// TRY int instead of integer?


		//Stack created from Array with values
		Integer[] empty = new Integer[12];
		Integer[] integerStack = {0,5,10,51,20};
		Stack<Integer> s4 = new StackImpl<>(empty,integerStack);

		//Test Stack Push Functionality change through s1 to s4 variable. so s1.push()

		try{
			for (int i=0;i<2;i++){
			s4.push(i);

		}

		} catch(StackFullException e){
			logger.info(e.toString());
		}

		// Test Stack Pop Functionality change from s1 to s4. only line needs changing is s1.pop()
		try{
			for (int i=0; i<5; i++){
				logger.info(s4.pop().toString());
			}
		} catch(StackEmptyException e){
			logger.info(e.toString());
		}

		logger.info("Size of Stack is " + s4.size());

	}
}