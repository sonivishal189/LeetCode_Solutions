package vishal.leetcode.solutions;

import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(new IntegerToRoman().intToRoman(sc.nextInt()));
		sc.close();
	}

	public String intToRoman(int num) {
		String s = "";
		// int c = 0;
		int n;
		for (int i = 1; i <= num; i++) {
			s += "I";
			n = s.length();
			if (i % 10 == 4) {
				s = s.substring(0, n - 4);
				s += "IV";
			}
			if (i % 10 == 5) {
				s = s.substring(0, n - 3);
				s += "V";
			}
			if (i % 10 == 9) {
				s = s.substring(0, n - 5);
				s += "IX";
			}
			if (i % 10 == 0) {
				s = s.substring(0, n - 3);
				s += "X";
			}
			if (i % 100 == 40) {
				s = s.substring(0, n - 5);
				s += "L";
			}
			if (i % 100 == 50) {
				s = s.substring(0, n - 5);
				s += "L";
			}
			if (i % 100 == 90) {
				s = s.substring(0, n - 7);
				s += "XC";
			}
			if (i % 100 == 00) {
				s = s.substring(0, n - 5);
				s += "C";
			}
			if (i % 1000 == 400) {
				s = s.substring(0, n - 7);
				s += "D";
			}
			if (i % 1000 == 500) {
				s = s.substring(0, n - 7);
				s += "D";
			}
			if (i % 1000 == 900) {
				s = s.substring(0, n - 9);
				s += "CM";
			}
			if (i % 1000 == 0) {
				s = s.substring(0, n - 7);
				s += "M";
			}
		}
		return s;
	}
}
