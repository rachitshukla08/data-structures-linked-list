package com.capgemini.datastructure.queue;

import com.capgemini.datastructure.linkedlist.INode;
import com.capgemini.datastructure.linkedlist.MyLinkedList;

public class MyQueue {
	private final MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
	}
}