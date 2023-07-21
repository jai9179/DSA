package Introduction;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
Example Input
Input 1:
19
Input 2:
1
Example Output
Output 1:
8
Output 2:
0 */
public class Countofprimes {
    public static void main(String[] args) {
        int N = 19;
        int result = solve(N);
        System.out.println(result);
    }

    public static int solve(int A) {
        boolean isPrime[] = new boolean[A + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= (int) Math.sqrt(A); i++) {
            for (int j = i * i; j < A; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 1; i <= A; i++) {
            if (isPrime[i] == true) {
                count++;
            }
        }
        return count;
    }
}
