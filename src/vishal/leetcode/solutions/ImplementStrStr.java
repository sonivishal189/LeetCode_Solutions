package vishal.leetcode.solutions;

import java.util.Scanner;

public class ImplementStrStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();
        System.out.println(new ImplementStrStr().strStr(haystack, needle));
        sc.close();
    }

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
