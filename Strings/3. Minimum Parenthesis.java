import java.util.* ;

 

public class Solution {

    public static int minimumParentheses(String pattern) {

        int count1 = 0;

        int count2 = 0;

        int returnValue;

 

        for (int i = 0; i <pattern.length() ; i++) {

            if (pattern.charAt(i) == '('){

                count1++;

            } else if (pattern.charAt(i) == ')') {

                if (count1 > 0) {

                    count1--;

                }else {count2++;}

            }

 

        }returnValue = count1 + count2;

        return returnValue;

    }

 

}
//https://www.codingninjas.com/studio/problems/mnfrj_1075018?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube
