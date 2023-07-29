/*
 * Range Sum Query - II
 * Problem Description
 You are given an integer array A of length N.
 You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
 More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 Problem Constraints
 1 <= N, M <= 103
 1 <= A[i] <= 105
 0 <= L <= R < N
 Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:
A = [2, 2, 2]
B = [[0, 0], [1, 2]]
Example Output
Output 1:
[10, 5]
Output 2:
[2, 4]
Example Explanation
Explanation 1:
The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
 */
public class RangeSumQuery {
    public static int[] solve(int[] A, int[][] B) {
        int ans[] = new int[2];
        for (int i = 0; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];
            int sum = 0;
            for (int j = start; j <= end; j++) {
                sum += A[j];
            }
            ans[i] = sum;

        }
        return ans;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5 };
        int B[][] = { { 0, 3 }, { 1, 2 } };
        int result[] = solve(A, B);
        print(result);

    }

    public static void print(int result[]) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
