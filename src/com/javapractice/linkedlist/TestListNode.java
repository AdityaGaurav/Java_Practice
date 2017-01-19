package com.javapractice.linkedlist;

public class TestListNode {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(6);
		ListNode node3 = new ListNode(7);
		LinkedListOperation opn = new LinkedListOperation();
		opn.insertInLinkList(node2, node1, 2);
		opn.insertInLinkList(node3, node1, 3);
//		node1.setData(4);
		opn.displayDataOfLinkedList(node1);
//		System.out.println("\n====================================");
//		System.out.println(opn.traverseList(node1));
//		System.out.println(node1.getData());

	}

}
