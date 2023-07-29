/*
 * Second Largest
 * Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
Problem Constraints
1 <= |A| <= 105
0 <= A[i] <= 109
Example Input
Input 1:
 A = [2, 1, 2] 
Input 2:
 A = [2]
Example Output
Output 1:
 1 
Output 2:
-1 
 */
public class SecondLargest {
    public static int solve(int[] A) {
        if (A.length == 1 || A.length == 0) {
            return -1;
        }
        if (A.length == 2) {
            if (A[0] == A[1]) {
                return -1;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        for (int i = A.length - 1; i > 0; i--) {
            if (A[i] != A[i - 1]) {
                return A[i - 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int A[] = { 2, 2, 2, 2, 2, 2, 2, 2 };
        int result = solve(A);
        System.out.println(result);
    }
}
