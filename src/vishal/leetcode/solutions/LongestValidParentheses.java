package vishal.leetcode.solutions;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println((new LongestValidParentheses()).longestValidParentheses(sc.next()));
		sc.close();
	}

	public int longestValidParentheses(String s) {
		int count = 0;
		int max = -1;
		Stack<Integer> stack = new Stack<>();
		char ch;
		int[] indicator = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch == '(') {
				stack.push(i);
			} else if (ch == ')' && !stack.isEmpty()) {
				indicator[i] = -1;
				indicator[stack.pop()] = -1;
			}
		}
		for (int x : indicator) {
			if (x != -1) {
				max = (max > count ? max : count);
				count = 0;
			} else {
				count++;
			}
		}
		max = (max > count ? max : count);
		return max;
	}
}
