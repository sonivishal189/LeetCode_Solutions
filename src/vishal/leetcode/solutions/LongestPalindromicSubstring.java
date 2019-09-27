package vishal.leetcode.solutions;

import java.util.Scanner;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(new LongestPalindromicSubstring().longestPalindrome(sc.next()));
		sc.close();
	}

	public String longestPalindrome(String s) {
		int n = s.length();
		for (int i = n; i > 0; i--) {
			for (int j = 0; j <= n - i; j++) {
				if (isPalindromic(s.substring(j, j + i)))
					return s.substring(j, j + i);
			}
		}
		return "";
	}

	public boolean isPalindromic(String s) {
		int n = s.length();
		for (int i = 0; i <= n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - i - 1))
				return false;
		}
		return true;
	}
}
