package linearpkg.queuePkg;

public class MyThreadQ implements Runnable {

	public Thread thrd;
	Queue q;


	//Construct new thread
	public MyThreadQ(String name, Queue q){
		thrd = new Thread(this, name);
		this.q = q;
		thrd.start(); // start thread
	}


	//begin execution of thread (Entry point)
	public void run(){
		System.out.println(thrd.getName() + " starting");

		// print all values from queue
		q.put(200);
		q.printQueue();


	
	


		

		System.out.println(thrd.getName() + " terminating");

	}
}

