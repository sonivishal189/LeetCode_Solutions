package vishal.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		int[] a = {-1,0,1,2,-1,-4};
		List<List<Integer>> list = new ThreeSum().threeSum(a);
		System.out.println(list);
	}

	public List<List<Integer>> threeSum(int[] a) {
		Arrays.sort(a);
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < a.length - 2; i++) {
			int lo = i + 1, hi = a.length - 1;
			while (lo < hi) {
				int sum = a[i] + a[lo] + a[hi];
				if (sum == 0) {
					res.add(Arrays.asList(a[i], a[lo], a[hi]));
					while (lo < hi && a[lo] == a[lo+1]) lo++;
					while (lo < hi && a[hi] == a[hi-1]) hi--;
					lo++;
					hi--;
				} else if(sum > 0) {
					hi--;
				} else {
					lo++;
				}
			}
		}
		Set<List<Integer>> set = new HashSet<>(res);
		res = new ArrayList<>(set);
		return res;
	}
}
