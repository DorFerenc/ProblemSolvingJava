package level1;

/*
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 */

public class MiddleOfTheLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode p1 = head;

		if (p1.next == null)
			return p1;

		int counter = 1;
		while(p1.next != null) {
			counter++;
			p1 = p1.next;
		}
		counter = (counter / 2) + 1;
		p1 = head;
		while (counter > 1) {
			counter--;
			p1 = p1.next;
		}

		return p1;
	}
}
