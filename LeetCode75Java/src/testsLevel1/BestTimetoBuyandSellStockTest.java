package testsLevel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import level1.BestTimetoBuyandSellStock;

class BestTimetoBuyandSellStockTest {

	BestTimetoBuyandSellStock temp = new BestTimetoBuyandSellStock();
	
	@Test
	void test1() {
		int[] prices = {7, 1, 5, 3, 6, 4};
		int expRes = 5;
		int res = temp.maxProfit(prices);
		System.out.println(res);
		assertEquals(expRes, res);
	}
	
	@Test
	void test2() {
		int[] prices = {7, 6, 4, 3, 1};
		int expRes = 0;
		int res = temp.maxProfit(prices);
		System.out.println(res);
		assertEquals(expRes, res);
	}

}
