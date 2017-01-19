package com.javapractice.linkedlist;

public class LinkedListOperation {

	public int traverseList(ListNode headNode) {
		int length = 0;
		if (headNode == null) {
			return 0;
		}

		ListNode currentNode = headNode;
		while (currentNode != null) {
			length++;
			// System.out.print(currentNode.getData()+" -> ");
			currentNode = currentNode.getNext();

		}
		return length;
	}

	public ListNode insertInLinkList(ListNode nodeToInsert, ListNode headNode, int position) {
		// inserting at the beginning
		if (headNode == null) {
			return headNode;
		}
		int length = traverseList(headNode);
		if (position > length + 1 || position < 1) {
			System.out.println("Position of node to insert is invalid. The valid inputs " + "are 1 to" + (length + 1));
		}
		if (position == 1) {
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		} else {
			// insert node in the middle or at the end
			ListNode previousNode = headNode;
			int count = 1;
			while (count < position - 1) {
				previousNode = previousNode.getNext();
				count++;
			}
			ListNode currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
		}
		return headNode;
	}

	public ListNode deleteNodeFromLinkedList(ListNode headNode, int position) {
		int size = traverseList(headNode);
		if (position > size || position < 1) {
			System.out.println("Position of Node to delete is Invalid. The valid input are 1 to" + size);
			return headNode;
		}

		if (position == 1) {
			ListNode currentNode = headNode.getNext();
			headNode = null;
			return currentNode;
		} else {
			// deleting the node inside or at the end
			ListNode previousNode = headNode;
			int count = 1;

			while (count < position) {
				previousNode = previousNode.getNext();
				count++;
			}

			ListNode currentNode = previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode = null;

		}
		return headNode;

	}

	public void displayDataOfLinkedList(ListNode headNode) {

		if (headNode == null) {
			System.out.println("No element present in linked list");

		}

		int element;
		ListNode tempNode = headNode;

		while (tempNode != null) {
			element = tempNode.getData();
			System.out.print(element + " ->");
			tempNode = tempNode.getNext();

		}

	}

}
