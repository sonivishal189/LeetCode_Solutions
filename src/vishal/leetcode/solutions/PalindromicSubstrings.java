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
		for (int i = 0; i < s.length(); i++) {
			count++;
			for (int j = i + 1; j < s.length(); j++) {
				StringBuilder str = new StringBuilder(s.substring(i, j + 1));
				if (str.toString().equals(str.reverse().toString())) {
					count++;
				}
			}
		}
		return count;
	}

}
