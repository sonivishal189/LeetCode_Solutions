package vishal.leetcode.solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println((new BestTimeToBuyAndSellStock()).maxProfit(arr));
        sc.close();
    }

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int profit = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] > max) {
                max = prices[i];
            } else if (profit < max - prices[i]) {
                profit = max - prices[i];
            }
        }
        return profit;
    }
}
