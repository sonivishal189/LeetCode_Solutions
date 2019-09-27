package vishal.leetcode.solutions;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] a = {-3,-1,0,0,0,3,3};
		System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(a));
	}

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		int i = 0;
		for (int n : set) {
			nums[i++] = n;
		}
		return set.size();
	}
}
