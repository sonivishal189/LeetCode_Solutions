package vishal.leetcode.solutions;

public class RemoveElement {

	public static void main(String[] args) {
		int a[] = {};
		int val = 0;
		System.out.println(new RemoveElement().removeElement(a, val));
	}

	public int removeElement(int[] a, int val) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != val) {
				c++;
			}
		}
		int j, temp;
		for (int i = 0; i < a.length - 1; i++) {
			j = i + 1;
			while (j < a.length && a[j] == val) {
				j++;
			}
			if(j < a.length) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return c;
	}
}
