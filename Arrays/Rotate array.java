import java.util.*;

public class Solution {
    public static void rotateArrayLeft(int[] arr, int K) {
        int N = arr.length;
        K = K % N;

        int[] temp = new int[K];

        // Copy the first K elements to temp array
        for (int i = 0; i < K; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements towards the left
        for (int i = K; i < N; i++) {
            arr[i - K] = arr[i];
        }

        // Copy the elements from the temp array back to arr
        for (int i = 0; i < K; i++) {
            arr[N - K + i] = temp[i];
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of elements in the array
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int K = scanner.nextInt(); // Number of steps to rotate

        rotateArrayLeft(arr, K);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
