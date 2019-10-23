package vishal.leetcode.solutions;

import java.util.Scanner;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println((new MinCostClimbingStairs()).minCostClimbingStairs(arr));
        sc.close();
    }

    public int minCostClimbingStairs(int[] cost) {

        for (int i = 0; i < cost.length; i++) {
            if (i == 0 || i == 1) {
                continue;
            } else {
                cost[i] = Math.min(cost[i - 1] + cost[i], cost[i - 2] + cost[i]);
            }
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
