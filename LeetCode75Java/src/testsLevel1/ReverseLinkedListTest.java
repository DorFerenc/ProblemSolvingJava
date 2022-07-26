package testsLevel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1.ListNode;
import level1.ReverseLinkedList;

class ReverseLinkedListTest {
	
	private ReverseLinkedList temp = new ReverseLinkedList();
	
	@Test
	void testReverseList1() {
		ListNode list1 = new ListNode();
		int[] lArr1 = {1, 2, 3, 4, 5};
		list1 = list1.getHeadFromArray(lArr1);
		System.out.println("list1:" + list1.toString());
		
		ListNode expRes = new ListNode();
		int[] lArrExp = {5, 4, 3, 2, 1};
		expRes = expRes.getHeadFromArray(lArrExp);
		ListNode res = temp.reverseList(list1);

		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}
	
	@Test
	void testReverseList2() {
		ListNode list1 = new ListNode();
		int[] lArr1 = {1, 2};
		list1 = list1.getHeadFromArray(lArr1);
		System.out.println("list1:" + list1.toString());
		
		ListNode expRes = new ListNode();
		int[] lArrExp = {2, 1};
		expRes = expRes.getHeadFromArray(lArrExp);
		
		ListNode res = temp.reverseList(list1);

		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}
	
	@Test
	void testReverseList3() {
		ListNode list1 = new ListNode();
		int[] lArr1 = {};
		list1 = list1.getHeadFromArray(lArr1);
		System.out.println("list1:" + list1.toString());
		
		ListNode expRes = new ListNode();
		int[] lArrExp = {};
		expRes = expRes.getHeadFromArray(lArrExp);
		
		ListNode res = temp.reverseList(list1);

		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}
}
