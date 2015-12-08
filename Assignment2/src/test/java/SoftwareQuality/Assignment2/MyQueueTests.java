package SoftwareQuality.Assignment2;

import java.util.NoSuchElementException;

import SoftwareQuality.Assignment2.MyQueue;

import junit.framework.TestCase;

public class MyQueueTests extends TestCase{
	protected MyQueue queue;
	protected int size =3;

	protected void setUp(){
		queue = new MyQueue(size);		
	}
	
	public void testIsEmptyOnEmpty(){
		assertTrue(queue.isEmpty());
	}
	
	public void tesIsNotEmptyOnNotEmpty(){
		queue.enqueue(1);
		assertTrue(!queue.isEmpty());
	}
	
	public void testSizeOnEmpty(){
		assertTrue(queue.size() == 0);
	}
	
	public void testSizeNotEmpty(){
		queue.enqueue(1);
		queue.enqueue(7);
		assertTrue(queue.size() == 2);
	}
	
	public void testEnqueueOnEmpty(){
		int sizeInit = queue.size();
		queue.enqueue(3);
		int sizeFinal = queue.size();
		assertTrue(sizeFinal - sizeInit == 1);
		assertTrue(queue.dequeue() == 3);
	}
	
	public void testEnqueue(){
		queue.enqueue(3);
		queue.enqueue(2);
		int sizeInit = queue.size();
		queue.enqueue(1);
		int sizeFinal = queue.size();
		assertTrue(sizeFinal - sizeInit == 1);
		assertTrue(queue.dequeue() == 3);	
	}
	
	public void testEnqueueFull(){
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		try{
			queue.enqueue(1);
		}catch(IllegalStateException ex){
   		 assertTrue(ex.getMessage().equals("Stack is full, can't push a value"));
   	 }
	}
	
	public void testDequeueOnEmpty(){
		try{
			queue.dequeue();
		}catch(NoSuchElementException ex){
			assertTrue(ex.getMessage().equals("Queue underflow"));
		}		
	}
	
	public void testDequeue(){
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		int sizeInit = queue.size();
	    int result = queue.dequeue();
	    int sizeFinal = queue.size();
	    assertTrue(sizeInit - sizeFinal == 1);
	    assertTrue(result == 1);
	}
	
	
}