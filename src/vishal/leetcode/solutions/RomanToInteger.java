package vishal.leetcode.solutions;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(new RomanToInteger().romanToInt(s));
	}

	public int romanToInt(String s) {
		char ch;
		int n, i, res=0;
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for(i=0; i<s.length()-1 ; i++) {
			ch = s.charAt(i);
			n = map.get(ch);
			ch = s.charAt(i+1);
			if(map.get(ch) > n) {
				res += map.get(ch) - n;
				i++;
			} else {
				res += n;
			}
		}
		if(i < s.length()) {
			res += map.get(s.charAt(i));
		}
		return res;
	}
}
