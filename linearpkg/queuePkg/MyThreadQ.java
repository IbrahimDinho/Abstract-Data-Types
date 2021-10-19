package linearpkg.queuePkg;

public class MyThreadQ implements Runnable {

	Thread thrd;
	Queue q;


	//Construct new thread
	MyThreadQ(String name, Queue q){
		thrd = new Thread(this, name);
		thrd.start(); // start thread
		this.q = q;
	}

	//begin execution of thread (Entry point)
	public void run(){
		System.out.println(thrd.getName() + " starting");

		

		// put values into queue
		q.put(5);
		q.put(10);
		q.put(15);
		q.put(20);

		// get values from queue
		int val1 = q.get();
		int val2 = q.get();

		// allow for context switch
		try{
			Thread.sleep(200); 
		} catch (InterruptedException exc){
			System.out.println("Thread interrupted");
		}


		System.out.println(thrd.getName() + " terminating");

	}
}

