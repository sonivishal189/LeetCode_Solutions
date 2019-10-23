package vishal.leetcode.solutions;

import java.util.Scanner;

public class DivisorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((new DivisorGame()).divisorGame(sc.nextInt()));
        sc.close();
    }

    public boolean divisorGame(int N) {
        if (N == 1)
            return false;
        else if (N == 2)
            return true;
        else if (N % 2 == 0)
            return true;
        else
            return false;
    }
}
