package vishal.leetcode.solutions;

public class ContainerWithMostWater {
    public static void main(String[] args) {

    }

    public int maxArea(int[] h) {
        int c=0, max=0, w=0;
        for(int i=0 ; i<h.length-1 ; i++) {
            c=0;
            for(int j=i+1 ; j<h.length ; j++) {
                c++;
                w = (h[i] < h[j] ? h[i] : h[j]);
                w = w*c;
                if(w > max) {
                    max = w;
                }
            }
        }
        return max;
    }
}
