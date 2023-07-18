// 18th july 2023

import java.util.* ;
import java.io.*; 
public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int n = arr.length;
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;

        // Calculate the total sum of all elements in the array
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            // Subtract the current element from the rightSum
            rightSum = totalSum - arr[i] - leftSum;

            if (leftSum == rightSum) {
                return i;
            }

            // Add the current element to the leftSum
            leftSum += arr[i];
        }

        return -1;
	}
}

//solution link-https://www.codingninjas.com/studio/problems/equilibrium-index_893014?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTab=0
