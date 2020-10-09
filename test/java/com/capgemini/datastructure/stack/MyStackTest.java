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
	
	@Test
	public void given3Numbers_WhenPopped_ShouldMatchLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.pop();
		assertEquals(myThirdNode, myNode);
		System.out.print("Popped Node: "+myNode.getKey()+ " .New Stack -> ");
		myStack.printStack();
	}
	
	@Test
	public void given3Numbers_WhenPeeked_ShouldReturnLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peek();
		assertEquals(myThirdNode, myNode);
		System.out.println("Peeking: "+myNode.getKey());
	}
}