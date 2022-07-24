package Level1;

public class RunningSumJava {
	/*
	 * Given an array nums. 
	 * We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
	 * Return the running sum of nums.
	*/

	public int[] runningSum(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			nums[i + 1] += nums[i];
		}
		return nums;	
	}
}
