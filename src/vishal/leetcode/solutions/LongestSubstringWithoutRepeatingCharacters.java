package vishal.leetcode.solutions;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(sc.nextLine()));
		sc.close();
	}

	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int ans = 0;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j <= n; j++)
				if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
		return ans;
	}

	public boolean allUnique(String s, int start, int end) {
		Set<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch)) return false;
			set.add(ch);
		}
		return true;
	}
}
