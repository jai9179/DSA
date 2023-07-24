package Introduction;

/*Problem Description
You are given an integer A. You have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

A proper divisor of a natural number is the divisor that is strictly less than the number.
Example Input
Input 1:
A = 4
Input 2:
A = 6
Example Output
Output 1:
0 
Output 2:
1 
Example Explanation
Explanation 1:
For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
Explanation 2:
For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6. 
*/
public class FindPerfectNumbers {
    public static void main(String[] args) {
        int N = 45;
        int result = solve(N);
        System.out.println(result);
    }

    public static int solve(int A) {
        int sum = 0;
        for (int i = 1; i < A; i++) {
            if (A % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == A) {
            return 1;
        } else {
            return 0;
        }
    }
}
