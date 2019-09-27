package vishal.leetcode.solutions;

public class StringToInteger {

	public static void main(String[] args) {
		String s = "2147483648";
		System.out.println(new StringToInteger().myAtoi(s));
	}

	public int myAtoi(String str) {
		String s = "";
		boolean f = false;
		char c = ' ';
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (Character.isWhitespace(c) && !f) {
				continue;
			} else if ((c == '-' || c == '+') && !f) {
				s = String.valueOf(c) + s;
				//sign = true;
				f = true;
			} else if (Character.isDigit(c)) {
				s = s + String.valueOf(c);
				f = true;
			} else {
				break;
			}
		}
		if (s.equals("") || s.equals("-") || s.equals("+")) {
			return 0;
		}
		char ch = ' ';
		for(int i=0 ; i<s.length() ; i++) {
			ch = s.charAt(i);
			if(ch == '-' || ch == '+') {
				continue;
			} else if(ch != '0') {
				break;
			} else {
				if(Character.isDigit(s.charAt(0))) {
					s = s.substring(i);
				} else {
					s = String.valueOf(s.charAt(0)) + s.substring(i);
				}
			}
		}
		if (s.equals("") || s.equals("-") || s.equals("+")) {
			return 0;
		}
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			//System.out.println(s);
			if(s.charAt(0) == '-') {
				return Integer.MIN_VALUE;
			}else {
				return Integer.MAX_VALUE;
			}
		}
	}
}
