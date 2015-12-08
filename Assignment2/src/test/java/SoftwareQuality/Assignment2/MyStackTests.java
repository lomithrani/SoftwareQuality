package SoftwareQuality.Assignment2;

import SoftwareQuality.Assignment2.MyStack;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MyStackTests extends TestCase {
     protected MyStack stack;
     protected int size=3;
	
     
     protected void setUp(){
    	 stack = new MyStack(size);
     }
     
     public void testConstructorNegValue(){
     	try {
     		stack = new MyStack(-1);
     	}catch NegativeArraySizeException(ex){
    		 assertTrue(ex.getMessage().equals("Negative value for array, can't be done!"));
    	 }
     	
     	
     }
     public void testConstructorPosValue(){
     	stack = new MyStack(10);
     	assertTrue(stack.getStack().length==10);
     }
     public void testConstructorNullValue(){
     	stack = new MyStack(0);
     	assertTrue(stack.getStack().length==0);
     }
     
     public void testIsEmpty(){
    	 assertTrue(stack.isEmpty());
     }
     public void testIsFull(){
    	 stack.push(1);
    	 stack.push(1);
    	 stack.push(1);
    	 assertTrue(stack.isFull());
     }
     
     public void testGetNumberOfElements(){
    	 assertTrue(stack.getNumberOfElements() == 0);
    	 stack.push(1);
    	 assertTrue(stack.getNumberOfElements() == 1);
     }
     
     public void testPushNotFull(){
    	 int startSize = stack.getNumberOfElements();
    	 stack.push(1);
    	 int endSize = stack.getNumberOfElements();
    	 assertTrue(endSize - startSize == 1);   	 
     }
     
     public void testPushFull(){
    	 stack.push(1);
    	 stack.push(3);
    	 stack.push(2);
    	 assertTrue(stack.isFull());
    	 try{
    		 stack.push(2);
    	 }catch(IllegalStateException ex){
    		 assertTrue(ex.getMessage().equals("Stack is full, can't push a value"));
    	 }
     }
     
     public void testPopOnEmpty(){
    	 assertTrue(stack.isEmpty());
    	 try{
    		 stack.pop();
    	 }catch (IllegalStateException ex){
    		 assertTrue(ex.getMessage().equals("Can't pop...stack is empty"));    		 
    	 }
     }
     
     public void testPopOnNotEmpty(){
    	 stack.push(1);
    	 assertTrue(!stack.isEmpty());
    	 try{
    		 int startSize = stack.getNumberOfElements();
    		 stack.pop();
    		 int endSize = stack.getNumberOfElements();
    		 assertTrue(startSize - endSize == 1);
    	 }catch(Exception ex){
    		 
    	 }
     }
     
     public void testgetStack(){
    	 stack.push(1);
    	 stack.push(2);
    	 stack.push(3);
    	 int[] resultStack = stack.getStack();
    	 int[] expected = new int[]{1 , 2 ,3};
    	 for(int i = 0; i < 3; i++){
    		 assertTrue(resultStack[i] == expected[i]);
    	 }
     }
     
     public void testSetStackNotTooBig(){
    	 int[] tempStack = {3,2,1};
    	 stack.setStack(tempStack);
    	 stack.pop();
    	 stack.pop();
    	 assertTrue(stack.getStack()[0] == 3 && stack.getStack()[1] == 0 && stack.getStack()[2] == 0);
     }
     
     public void testSetStackTooBig(){
    	 int[] tempStack = {1,2,3,4};
    	 try{
    		 stack.setStack(tempStack);
    	 }catch(IllegalStateException ex){
    		 assertTrue(ex.getMessage() == "Can't set stack, stack is too big");
    	 }
     }
     
     public void testHeadOnNotEmpty(){
    	 stack.push(1);
    	 stack.push(2);
    	 assertTrue(stack.head() == 2);
     }
     
     public void testHeadIsEmpty(){
    	 try{
    		 stack.isEmpty();
    	 }catch(IllegalStateException ex){
    		 assertTrue(ex.getMessage().equals("Can't return head, stack is empty..."));
    	 }
     }
}
