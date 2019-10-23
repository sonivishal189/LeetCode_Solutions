package vishal.leetcode.solutions;

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((new IsSubsequence()).isSubsequence(sc.nextLine(), sc.nextLine()));
        sc.close();
    }

    public boolean isSubsequence(String s, String t) {
        int index = -1;
        boolean found = false;
        for (char ch : s.toCharArray()) {
            found = false;
            for (int i = index + 1; i < t.length(); i++) {
                if (t.charAt(i) == ch) {
                    found = true;
                    index = i;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
