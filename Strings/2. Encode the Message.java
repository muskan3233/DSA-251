import java.util.* ;
import java.io.*; 
public class Solution {
	public static String encode(String input) {
		// Write your code here.
		int n = input.length();
        if (n == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Add the last character and its count to the result string
        result.append(input.charAt(n - 1)).append(count);

        return result.toString();
	}
}
//https://www.codingninjas.com/studio/problems/encode-the-message_699836?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTab=0
