package vishal.leetcode.solutions;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((new ClimbingStairs()).climbStairs(sc.nextInt()));
        sc.close();
    }

    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        if (n == a)
            return a;
        if (n == b)
            return b;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
