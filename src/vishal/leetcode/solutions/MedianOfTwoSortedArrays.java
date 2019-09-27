package vishal.leetcode.solutions;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] n1 = { 1, 2 };
		int[] n2 = { 3, 4 };
		System.out.print(new MedianOfTwoSortedArrays().findMedianSortedArrays(n1, n2));
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int []a = Arrays.copyOf(nums1, n+m);
		System.arraycopy(nums2, 0, a, m, n);
		Arrays.sort(a);
		if(a.length % 2 == 0) {
			return (a[(m+n)/2]+a[(m+n)/2 - 1])/2.0;
		}
		return a[(m+n)/2];
	}
}
