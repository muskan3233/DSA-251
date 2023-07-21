public class Solution {

    public static int makeBeautiful(String str) {

        int countOdd0 = 0,countEven0=0;

        int countEven1 = 0, countOdd1 = 0;

        int ans = 0;

        int even=0,odd=0;

        for(int i=0;i<str.length();i++){

            if(i%2==0){

                even++;

                if(str.charAt(i)=='0')

                    countEven0++;

                else

                    countEven1++;

            }

            else{

                odd++;

                if(str.charAt(i)=='0')

                    countOdd0++;

                else 

                    countOdd1++;

            }

        }

        ans = Math.min((even-countEven0)+(odd-countOdd1), (even-countEven1)+(odd-countOdd0));

        return ans;

    }

}
//https://www.codingninjas.com/studio/problems/beautiful-string_1115625?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTab=1
