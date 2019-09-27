package vishal.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindAndReplacePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String words[] = new String[n];
		if (n > 0) {
			System.out.println("Enter " + n + " words : ");
		}
		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
		}
		System.out.println("Pattern : ");
		String pattern = sc.next();
		System.out.println((new FindAndReplacePattern()).findAndReplacePattern(words, pattern));
		sc.close();
	}

	public List<String> findAndReplacePattern(String[] words, String pattern) {

		List<String> res = new ArrayList<String>();
		for (String word : words) {
			String s = "";
			Map<Character, Character> map = new HashMap<>();
			if (word.length() == pattern.length()) {
				for (int i = 0; i < word.length(); i++) {
					char ch = word.charAt(i);
					char pt = pattern.charAt(i);
					if (!map.containsKey(ch) && !map.containsValue(pt)) {
						map.put(ch, pt);
					}
					s += map.get(ch);
				}
				if (s.equals(pattern)) {
					res.add(word);
				}
			}
		}
		return res;

	}
}
