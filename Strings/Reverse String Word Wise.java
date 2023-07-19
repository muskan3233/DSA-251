import java.util.Scanner;

class Solution {
    static String reverseStringWordWise(String input) {
        String []word = input.split(" ");

        StringBuilder str = new StringBuilder();
        for(int i=word.length-1; i>=0; i--)
        {
            str.append(word[i]);
            if(i>0){
                str.append(" ");
            }
        }
        // convert StringBuilder to string
        return str.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
