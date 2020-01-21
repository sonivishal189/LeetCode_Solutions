package vishal.leetcode.solutions;

import java.util.Scanner;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        LongestCommonSubsequence obj = new LongestCommonSubsequence();
        System.out.println(obj.longestCommonSubsequence(s1, s2));
        sc.close();
    }

    public int longestCommonSubsequence (String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int dp[][] = new int[l2+1][l1+1];
        for (int i=0 ; i<=l2 ; i++) {
            for (int j=0 ; j<=l1 ; j++) {
                if (i==0 || j==0) {
                    dp[i][j] = 0;
                } else if (text1.charAt(j-1) == text2.charAt(i-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[l2][l1];
    }
}
