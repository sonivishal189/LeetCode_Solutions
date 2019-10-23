package vishal.leetcode.solutions;

import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println((new HouseRobber()).rob(a));
        sc.close();
    }

    public int rob(int[] nums) {
        int max = 0;
        int n = nums.length;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                a[i] = nums[i];
            } else {
                max = Integer.max(max, a[i - 2]);
                a[i] = nums[i] + max;
            }
        }
        if (n == 1) {
            return a[0];
        }
        if (n == 0) {
            return 0;
        }
        return Integer.max(a[n - 1], a[n - 2]);
    }
}
