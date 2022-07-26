package level1;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) //(head == null)
			return head;
		ListNode p1 = head;
		ListNode p2 = p1.next;
		ListNode temp;
		
		p1.next = null;
		while (p2.next != null) {
			temp = p2.next;
			p2.next = p1;			
			p1 = p2;
			p2 = temp;
		}
		p2.next = p1;
		return p2;
	}
}
