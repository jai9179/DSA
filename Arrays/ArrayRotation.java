/*
 * Array Rotation
 * Problem Description
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
Problem Constraints
1 <= N <= 105
1 <= A[i] <=109
1 <= B <= 109
Example Input
Input 1:
A = [1, 2, 3, 4]
B = 2
Input 2:
A = [2, 5, 6]
B = 1
Example Output
Output 1:
[3, 4, 1, 2]
Output 2:
[6, 2, 5]
 */
public class ArrayRotation {
    public static int[] solve(int[] A, int B) {
        B = B % A.length;
        reverse(A, 0, A.length - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, A.length - 1);
        return A;
    }

    public static void reverse(int A[], int i, int j) {
        while (i < j) {
            int temp = A[j];
            A[j] = A[i];
            A[i] = temp;
            i++;
            j--;
        }
    }

    public static void print(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4 };
        int B = 2;
        solve(A, B);
        print(A);
    }

}
