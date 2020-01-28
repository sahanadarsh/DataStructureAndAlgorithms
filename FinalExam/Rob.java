package FinalExam;

/*
Q6
You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed. All houses at this place are arranged in a circle.
That means the first house is the neighbor of the last one. Meanwhile,
adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house,
determine the maximum amount of money you can rob tonight without alerting the police.

Example:
Input: [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),because they are adjacent houses.

Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.
 */

public class Rob {

	public static int rob(int[] nums) {
		if(nums.length == 0){
			return 0;
		}else if(nums.length == 1) {
			return nums[0];
		}

		//if the person robs from first home i.e, from first home to last but second home
		int pre2 = 0, pre1 = 0; 
		int temp1 = 0;
		for(int i = 0; i <= nums.length-2; i++) {
			temp1 = Math.max(pre1, pre2 + nums[i]);
			pre2 = pre1;
			pre1 = temp1;
		}
		int temp2 = pre1;

		//if the person robs from second home i.e, from second home to last home
		pre1 = 0;
		pre2 = 0;
		for(int i = 1; i <= nums.length-1; i++) {
			temp1 = Math.max(pre1, pre2 + nums[i]);
			pre2 = pre1;
			pre1 = temp1;
		}		
		return Math.max(pre1,temp2);
	}

	public static void main(String[] args) {
		int[] nums = {2,3,2};
		System.out.println(rob(nums));
	}

}
