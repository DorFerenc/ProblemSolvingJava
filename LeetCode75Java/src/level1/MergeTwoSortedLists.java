package level1;

/*
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. 
 * The list should be made by splicing together the nodes of the first two lists.
 */

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l3 = new ListNode();
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode p3 = l3;
//        if (p1.val == 0 && p2.val == 0)
//            return l3.next;
        if (p1.val == 0)
            return list2;
        if (p2.val == 0)
            return list1;
        while (p1 != null && p2 != null) {
            if (p1.val == p2.val) {
                p3.next = new ListNode(p1.val, null);
                p3 = p3.next;
                p3.next = new ListNode(p2.val, null);
                p1 = p1.next;
                p2 = p2.next;
            }
            else if (p1.val < p2.val) {
                p3.next = new ListNode(p1.val, null);
                p1 = p1.next;
            }
            else { 
                p3.next = new ListNode(p2.val, null);
                p2 = p2.next;
            }
            p3 = p3.next;
        }
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                p3.next = new ListNode(p1.val, null);
                p1 = p1.next;
            }
            else {
                p3.next = new ListNode(p2.val, null);
                p2 = p2.next;
            }
            p3 = p3.next;
        }
        return l3.next;
	}
}
