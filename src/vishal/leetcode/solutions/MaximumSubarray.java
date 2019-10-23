package vishal.leetcode.solutions;

import java.util.Scanner;

public class MaximumSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println((new MaximumSubarray()).maxSubArray(arr));
		sc.close();
	}

	public int maxSubArray(int[] nums) {
		int a[] = new int[nums.length];
		int max = nums[0];
		if (nums[0] < 0) {
			a[0] = 0;
			max = nums[0];
		} else {
			a[0] = nums[0];
		}
		for (int i = 1; i < nums.length; i++) {
			a[i] = Integer.max(0, a[i - 1] + nums[i]);
			if (a[i] > max) {
				max = a[i];
			}
		}
		if (max == 0) {
			max = nums[0];
			for (int n : nums) {
				if (n > max) {
					max = n;
				}
			}
		}
		return max;
	}
}
