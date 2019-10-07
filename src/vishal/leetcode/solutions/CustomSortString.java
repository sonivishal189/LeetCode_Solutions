package vishal.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomSortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println((new CustomSortString()).customSortString(s, t));
		sc.close();
	}

	public String customSortString(String S, String T) {
		StringBuilder res = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : T.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for (char ch : S.toCharArray()) {
			int count = map.getOrDefault(ch, 0);
			for (int i = 0; i < count; i++) {
				res.append(ch);
			}
			map.remove(ch);
		}
		for (Character ch : map.keySet()) {
			int count = map.getOrDefault(ch, 0);
			for (int i = 0; i < count; i++) {
				res.append(ch);
			}
		}
		return res.toString();
	}

}
