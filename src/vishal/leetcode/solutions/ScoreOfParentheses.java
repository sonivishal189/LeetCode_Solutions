package vishal.leetcode.solutions;

import java.util.Scanner;
import java.util.Stack;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((new ScoreOfParentheses()).scoreOfParentheses(sc.nextLine()));
        sc.close();
    }

    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        for (char ch : S.toCharArray()) {
            if (ch == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = score == 0 ? 1 : 2 * score;
                score += stack.pop();
            }
        }
        return score;
    }
}
