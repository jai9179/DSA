/*
 *  Reverse the Array
 * Problem Description
You are given a constant array A.
You are required to return another array which is the reversed form of the input array.
Problem Constraints
1 <= A.size() <= 10000
1 <= A[i] <= 10000
Example Input
Input 1:
A = [1,2,3,2,1]
Input 2:
A = [1,1,10]
Example Output
Output 1:
 [1,2,3,2,1] 
Output 2:
 [10,1,1] 
 Example Explanation
Explanation 1:
Reversed form of input array is same as original array
Explanation 2:
Clearly, Reverse of [1,1,10] is [10,1,1]
 */
public class Arrayreverse {
    public static int[] solve(final int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i <= j) {
            int temp = A[j];
            A[j] = A[i];
            A[i] = temp;
            i++;
            j--;
        }
        return A;
    }

    public static void print(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 2, 1 };
        solve(A);
        print(A);

    }

}
