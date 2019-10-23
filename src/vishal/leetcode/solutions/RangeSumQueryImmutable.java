package vishal.leetcode.solutions;

class NumArray {

    private int [] a;

    public NumArray(int[] nums) {
        a = new int[nums.length];
        for (int i=0 ; i<nums.length ; i++) {
            if (i==0) {
                a[i] = nums[i];
            } else {
                a[i] = nums[i] + a[i-1];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return a[j];
        } else {
            return a[j] - a[i-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */