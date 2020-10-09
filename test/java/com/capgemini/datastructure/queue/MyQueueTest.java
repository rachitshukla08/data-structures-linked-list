package com.capgemini.datastructure.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.datastructure.linkedlist.INode;
import com.capgemini.datastructure.linkedlist.MyNode;
import com.capgemini.datastructure.stack.MyStack;

public class MyQueueTest {
	
	@Test
	public void given3Numbers_WhenEnqueued_ShouldHaveAddedToLast() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		myQueue.printQueue();
		assertEquals((int)myThirdNode.getKey(), 70);
	}
}
