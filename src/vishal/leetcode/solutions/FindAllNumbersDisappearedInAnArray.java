package vishal.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

	public static void main(String[] args) {
		int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		FindAllNumbersDisappearedInAnArray disappearedInAnArray = new FindAllNumbersDisappearedInAnArray();
		System.out.println(disappearedInAnArray.findDisappearedNumbers(nums));
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		int count[] = new int[nums.length + 1];
		for (int i : nums) {
			count[i] += 1;
		}

		for (int i = 1; i < count.length; i++) {
			if (count[i] == 0) {
				res.add(i);
			}
		}
		return res;
	}
}
