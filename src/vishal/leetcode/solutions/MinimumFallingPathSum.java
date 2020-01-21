package vishal.leetcode.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        for (int i=0 ; i<m ; i++) {
            for (int j=0 ; j<n ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        MinimumFallingPathSum pathSum = new MinimumFallingPathSum();
        System.out.println(pathSum.minFallingPathSum(matrix));
    }

    public int minFallingPathSum(int[][] A) {
        for (int i = 1; i < A.length; ++i)
            for (int j = 0; j < A.length; ++j)
                A[i][j] += Math.min(A[i - 1][j],
                        Math.min(A[i - 1][Math.max(0, j - 1)], A[i - 1][Math.min(A.length - 1, j + 1)]));
        Arrays.sort(A[A.length-1]);
        return A[A.length-1][0];
    }
}
