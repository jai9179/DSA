/*
 * Good Pair / Two Sum
 * Problem Description
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
Problem Constraints
1 <= A.size() <= 104
1 <= A[i] <= 109
1 <= B <= 109
Example Input
Input 1:
A = [1,2,3,4]
B = 7
Input 2:
A = [1,2,4]
B = 4
Example Output
Output 1:
1
Output 2:
0
 */
public class GoodPair {
    public static int solve(int[] A, int B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] + A[j] == B) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4 };
        int B = 7;
        int result = solve(A, B);
        System.out.println(result);
    }
}
