import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean isPossible(int[] arr, int n) {
		// Write your code here.
		int count =0;
		for(int i=1; i<n; i++){
			if (arr[i]<arr[i-1]){
				count++;
				if(i>1&&arr[i]<arr[i-2]){
				arr[i]=arr[i-1];
				}
				else{
					arr[i-1]=arr[i];
				}
			}

		}
		return count<=1;
	}
}

//solution link-https://www.codingninjas.com/studio/problems/non-decreasing-array_699920?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTab=1
