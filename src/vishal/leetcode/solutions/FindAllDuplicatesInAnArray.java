package vishal.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		int nums[] = { 8, 3, 2, 7, 8, 2, 3, 1 };
		FindAllDuplicatesInAnArray duplicatesInAnArray = new FindAllDuplicatesInAnArray();
		System.out.println(duplicatesInAnArray.findDuplicates(nums));
	}

	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<>();
		int count[] = new int[nums.length + 1];
		for (int i : nums) {
			count[i] += 1;
		}

		for (int i = 1; i < count.length; i++) {
			if (count[i] == 2) {
				res.add(i);
			}
		}
		return res;
	}
}
