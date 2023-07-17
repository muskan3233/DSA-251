import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            return -1;
        } else {
            return max2;
        }
	}
}
https://www.codingninjas.com/studio/problems/second-largest-element-in-the-array_873375?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTab=0
