package com.capgemini.datastructure.stack;

import com.capgemini.datastructure.linkedlist.INode;
import com.capgemini.datastructure.linkedlist.MyNode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyStackTest {
	
	@Test
	public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peek();
		myStack.printStack();
		assertEquals(myThirdNode, myNode);
	}
}