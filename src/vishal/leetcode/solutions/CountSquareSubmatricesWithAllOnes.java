package vishal.leetcode.solutions;

import java.util.Scanner;

public class CountSquareSubmatricesWithAllOnes {
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
        CountSquareSubmatricesWithAllOnes obj = new CountSquareSubmatricesWithAllOnes();
        System.out.println(obj.countSquares(matrix));
        sc.close();
    }

    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        for (int i = 1 ; i < m ; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = 1 + Integer.min(matrix[i-1][j], Integer.min(matrix[i-1][j-1], matrix[i][j-1]));
                }
            }
        }
        for (int i=0 ; i<m ; i++) {
            for (int j = 0; j < n; j++) {
                count += matrix[i][j];
            }
        }
        return count;
    }
}
