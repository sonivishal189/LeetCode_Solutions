package vishal.leetcode.solutions;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] a = {0,2,1,-3};
		int t = 1;
		int list = new ThreeSumClosest().threeSumClosest(a, t);
		System.out.println(list);
	}

	public int threeSumClosest(int[] a, int t) {
		Arrays.sort(a);
		int min = Integer.MAX_VALUE;
		int res = 0;
		for (int i = 0; i < a.length - 2; i++) {
			int lo = i + 1, hi = a.length - 1;
			while (lo < hi) {
				int sum = a[i] + a[lo] + a[hi];
				if (Math.abs(sum - t) < min) {
					min = Math.abs(sum - t);
					res = sum;
				}
				if(sum > t) {
					hi--;
				} else {
					lo++;
				}
			}
		}
		return res;
	}
}
