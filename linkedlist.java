package hortari;

import java.util.HashSet;
import java.util.Set;

// A linked list node

class linkedlist
{
	// Helper function to print given linked list
	public static void printList(Node head)
	{
		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " > ");
			ptr = ptr.next;
		}
		System.out.println("end");
	}

	// Function to remove duplicates from a sorted list
	public static Node removeDuplicates(Node head)
	{
		Node previous = null;
		Node current = head;

		// take an empty set to store linked list nodes for future reference
		Set<Integer> set = new HashSet<>();

		// do till linked list is not empty
		while (current != null)
		{
			// if current node is seen before, delete it
			if (set.contains(current.data)) {
				previous.next = current.next;
				set.remove(current);
			}
			else {
				// insert current node into the set and proceed to next node
				set.add(current.data);
				previous = current;
			}
			current = previous.next;
		}

		return head;
	}

	// main method to remove remove duplicates from list
	public static void main(String[] args)
	{
		// input keys
		int[] keys = {1, 3, 5, 3, 5, 5, 9, 7};

		// points to the head node of the linked list
		Node head = null;

		// construct linked list
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		removeDuplicates(head);

		// print linked list
		printList(head);
	}
}
class Node
{
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
};
