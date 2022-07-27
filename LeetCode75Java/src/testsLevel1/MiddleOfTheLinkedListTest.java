package testsLevel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import level1.ListNode;
import level1.MiddleOfTheLinkedList;

class MiddleOfTheLinkedListTest {
	
	private MiddleOfTheLinkedList temp = new MiddleOfTheLinkedList();
	private ListNode list1 = new ListNode();
	private ListNode expRes = new ListNode();;
	private ListNode res;
	
	@Test
	void test1() {
		int[] arr1 = {1, 2, 3, 4, 5};
		list1 = list1.getHeadFromArray(arr1);
		int[] arrExpRes = {3, 4, 5};
		expRes = expRes.getHeadFromArray(arrExpRes);
		res = temp.middleNode(list1);
		
		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}
	
	@Test
	void test2() {
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		list1 = list1.getHeadFromArray(arr1);
		int[] arrExpRes = {4, 5, 6};
		expRes = expRes.getHeadFromArray(arrExpRes);
		res = temp.middleNode(list1);
		
		System.out.println("res:" + res.toString() + " expRes:" + expRes.toString());
		assertEquals(expRes.toString(), res.toString());
	}

}
