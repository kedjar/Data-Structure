// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: This class implements multi-threading
// Place: At home
// Known Bugs: None

import java.util.ArrayList;

class Producer implements Runnable {
	int howMany;
	Queue queue;
	final int MAX_RAND = 20; // experiment with this value
	Producer(Queue queue, int howMany) {
		this.queue = queue;
		this.howMany = howMany;
	}
	public void run() {
		for (int i = 0; i<howMany; i++) {
			int n = (int) (Math.random()*MAX_RAND )+ 1;
			//System.out.println("n = "+n);
			queue.add(n);
		}
		queue.closeInput();
	}
}
class Consumer implements Runnable {
	Queue queue;
	int consId;
	public Consumer(Queue queue, int consId) {
		this.consId = consId;
		this.queue = queue;
	}
	public long NthFibonacci(int n) {
		// use the ineffective recursive algorithm (code we
		// developed in class) to compute the Nth Fibonacci number
		if (n <= 1) return n;
        else return NthFibonacci(n-1) + NthFibonacci(n-2);
	
	}
	public void run() {
		int n = 0;
		while ((!queue.inputClosed()) && (!queue.isQueueEmpty())) {
			n = queue.get();
			System.out.printf("C%d: The %dth Fib no is %d\n",
					consId, n, NthFibonacci(n));
		}
	}
}

// FIXME: use synchronized keyword to make sure public methods
// of this queue can be safely accessed from multiple threads.
class Queue {
	ArrayList<Integer> itemList = new ArrayList<Integer>();
	boolean inputClosed;
	synchronized public void add(int number) { // TODO
		itemList.add(number);
		System.out.println("number: "+number);
	}
	public boolean isQueueEmpty() { // TODO
		//System.out.println("isempty: "+itemList.isEmpty());
		return false;//itemList.isEmpty();
		
	}
	synchronized public int get() { // TODO
		//System.out.println("size: "+itemList.size());
		if(!itemList.isEmpty())
		return itemList.remove(0);
		return 0;
	}
	 public boolean inputClosed() {
		return inputClosed;
	}
	 public void closeInput() {
		inputClosed = true;
	}
}
public class MultiFibonacci {
	static final int NUM_CONS = 10;
	public static void main(String[] args) throws InterruptedException {
	Queue queue = new Queue();
	Thread consThreadList[] = new Thread[NUM_CONS];
	// create all consumers
	for (int i=0; i<consThreadList.length; i++) {
		consThreadList[i] = new Thread(new Consumer(queue,i));
		consThreadList[i].start();
	}
	// create and start producer thread
	(new Thread(new Producer(queue, 10))).start();
	// wait for all production to complete
	for (int i=0; i<consThreadList.length; i++) {
		consThreadList[i].join();
	}
	System.out.println("Production done!");
	}
}
