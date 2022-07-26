package testsLevel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1.ListNode;
import level1.MergeTwoSortedLists;

class MergeTwoSortedListsTest {
	
	private MergeTwoSortedLists temp = new MergeTwoSortedLists();
	
	@Test
	void test1() {
		ListNode list1 = new ListNode();
		ListNode list2 = new ListNode();
		int[] lArr1 = {1, 2, 4};
		int[] lArr2 = {1, 3, 4};
		list1 = list1.getHeadFromArray(lArr1);
		list2 = list2.getHeadFromArray(lArr2);
		System.out.println("l1:" + list1.toString() + " l2:" + list2.toString());
		
		ListNode expRes = new ListNode();
		int[] lArrExp = {1, 1, 2, 3, 4, 4};
		expRes = expRes.getHeadFromArray(lArrExp);
		
		ListNode res = temp.mergeTwoLists(list1, list2);

		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}
	
	@Test
	void test2() {
		ListNode list1 = new ListNode();
		ListNode list2 = new ListNode();
		int[] lArr1 = {};
		int[] lArr2 = {};
		list1 = list1.getHeadFromArray(lArr1);
		list2 = list2.getHeadFromArray(lArr2);
		System.out.println("l1:" + list1.toString() + " l2:" + list2.toString());
		
		ListNode expRes = new ListNode();
		int[] lArrExp = {};
		expRes = expRes.getHeadFromArray(lArrExp);
		
		ListNode res = temp.mergeTwoLists(list1, list2);
		
		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}
	
	@Test
	void test3() {
		ListNode list1 = new ListNode();
		ListNode list2 = new ListNode();
		int[] lArr1 = {};
		int[] lArr2 = {0};
		list1 = list1.getHeadFromArray(lArr1);
		list2 = list2.getHeadFromArray(lArr2);
		System.out.println("l1:" + list1.toString() + " l2:" + list2.toString());
		
		ListNode expRes = new ListNode();
		int[] lArrExp = {0};
		expRes = expRes.getHeadFromArray(lArrExp);
		
		ListNode res = temp.mergeTwoLists(list1, list2);
		
		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}
}
