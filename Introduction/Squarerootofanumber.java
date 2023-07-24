package Introduction;

/*Problem Description

Given a number A. Return square root of the number if it is perfect square otherwise return -1.

Note: A number is a perfect square if its square root is an integer.

Example Input

Input 1:
A = 4
Input 2:

A = 1001
Example Output

Output 1:
2
Output 2:

-1
 */
public class Squarerootofanumber {
    public static void main(String[] args) {
        int N = 25;
        int result = solve(N);
        System.out.println(result);
    }

    public static int solve(int A) {
        for (int i = 1; i * i <= A; i++) {
            if (i * i == A) {
                return i;
            }
        }
        return -1;
    }
}
