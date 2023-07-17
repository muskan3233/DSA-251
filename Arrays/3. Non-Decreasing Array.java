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
