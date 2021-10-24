import java.io.*;
import java.util.*;

//Demonstrate Queue class
public class QDemo {

	public static void main(String[] args) {
		
		
		
		Integer[] q = new Integer[10];

		// Test Different types
		Queue<Integer> qOb = new QueueImpl<>(q);
		



		Queue<Integer> qOb2 = new QueueImpl<>(7);
		Queue<String> qOb3 = new QueueImpl<>();

		// add values to Queue
		try {
			for(int i=0;i<4; i++){
				qOb.put(i);
			}

		} catch (QueueFullException e){
			System.out.println(e);
		}

		try{
			for(int i=0;i<5;i++){
				qOb3.put(""+i);
			}

		} catch(QueueFullException e){
			System.out.println(e);
		}

		// get values from Queue and print these values
		try{
			for(int i=0;i<qOb.size();i++){
				System.out.println(qOb.get());

			}

		} catch(QueueEmptyException e){
			System.out.println(e);
		}

		try{
			for(int i=0;i<qOb3.size();i++){
				System.out.println(qOb3.get());

			}

		} catch(QueueEmptyException e){
			System.out.println(e);
		}
}

}