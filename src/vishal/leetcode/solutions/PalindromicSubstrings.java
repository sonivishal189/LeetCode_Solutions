package vishal.leetcode.solutions;

import java.util.Scanner;

public class PalindromicSubstrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println((new PalindromicSubstrings()).countSubstrings(sc.next()));
		sc.close();
	}

	public int countSubstrings(String s) {
		int count = 0;
		int len = s.length();
		boolean dp[][] = new boolean[len][len];
		for (int i = 0; i < len; i++) {
			count++;
			dp[i][i] = true;
		}
		for (int j = 1; j < len; j++) {
			for (int i = 0; i < j; i++) {
				if (s.charAt(i) == s.charAt(j)) {
					if ((j - i <= 2) || (dp[i + 1][j - 1])) {
						count++;
						dp[i][j] = true;
					}
				} else {
					dp[i][j] = false;
				}
			}
		}
		/*
		 * for (int i=0 ; i<len ; i++) { for (int j=0 ; j<len ; j++) {
		 * System.out.print(dp[i][j] + " "); } System.out.println(); }
		 */
		return count;
	}

}
