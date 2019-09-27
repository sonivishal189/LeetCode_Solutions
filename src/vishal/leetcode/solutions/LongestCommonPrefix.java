package vishal.leetcode.solutions;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String a[] = {};
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(a));
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String s = "";
		try {
			for (int i = 0; i < strs[0].length(); i++) {
				s += strs[0].substring(i, i+1);
				for (int j = 0; j < strs.length; j++) {
					if(!strs[j].substring(0, s.length()).equals(s)) {
						return s.substring(0, s.length()-1);
					}
				}
			}

		} catch (Exception e) {
			return s.substring(0, s.length() - 1);
		}
		return s;
	}
}
