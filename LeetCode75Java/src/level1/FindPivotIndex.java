package level1;

import java.util.Arrays;

public class FindPivotIndex {
	/*
	 * Given an array of integers nums, calculate the pivot index of this array.
	 * The pivot index is the index where the sum of all the numbers
	 * 		strictly to the left of the index is equal to the sum of all 
	 * 		the numbers strictly to the index's right.
	 * If the index is on the left edge of the array, 
	 * 		then the left sum is 0 because there are no elements to the left. 
	 * 		This also applies to the right edge of the array.
	 * Return the leftmost pivot index. If no such index exists, return -1.
	 */
	public int pivotIndex(int[] nums) {
		int[] leftSum = new int[nums.length + 1];
		int[] rightSum = new int[nums.length + 1];
		int j = nums.length - 1;
		for (int i = 0; i < nums.length - 1; i++, j--) {
			leftSum[i + 1] = nums[i] + leftSum[i];
			rightSum[j] = nums[j] + rightSum[j + 1];
		}
		System.out.println("LEFT SUM: " + Arrays.toString(leftSum));
		System.out.println("RIGHT SUM: " + Arrays.toString(rightSum));
		for (int i = 0; i < leftSum.length - 1; i++) {
			if (leftSum[i] == rightSum[i + 1])
				return i;
		}
		return -1;
	}
}
