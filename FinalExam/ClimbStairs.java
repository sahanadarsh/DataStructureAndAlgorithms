package FinalExam;

/*
Q13
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Examples:
Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

public class ClimbStairs {

	public static int climbStairs(int n) {
		int[] arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}       
		return arr[n];
	}

	public static void main(String[] args) {
		int n = 2;
		System.out.println(climbStairs(n));
	}

}
