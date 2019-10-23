package vishal.leetcode.solutions;

import java.util.Scanner;

public class CountingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((new CountingBits()).countBits(sc.nextInt()));
        sc.close();
    }

    public int[] countBits(int num) {
        int a[] = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            if (i == 0) {
                a[i] = 0;
            } else if (i == 1) {
                a[i] = 1;
            } else {
                a[i] = a[i % 2] + a[i / 2];
            }
        }
        return a;
    }
}
