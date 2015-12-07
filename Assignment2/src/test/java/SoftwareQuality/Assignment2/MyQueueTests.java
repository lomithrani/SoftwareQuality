package SoftwareQuality.Assignment2;

import SoftwareQuality.Assignment2.MyQueue;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MyQueueTests extends TestCase{
	protected MyQueue queue;
	protected int size =3;

	protected void setUp(){
		queue = new MyQueue(size);		
	}
	
	public void testIsEmpty(){
		junit.framework.Assert.assertTrue(queue.isEmpty());
	}

	
}