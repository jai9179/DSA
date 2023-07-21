package Introduction;

/*Problem Description
Given a number A. Return 1 if A is prime and return 0 if not. 

Note : 
The value of A can cross the range of Integer. */
public class IsPrime {
    public static void main(String[] args) {
        int N = 19;
        int result = solve(N);
        System.out.println(result);
    }

    public static int solve(int A) {
        int factors = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if (i == A) {
                    factors += 1;
                }
                factors += 2;
            }
        }
        if (factors == 2) {
            return 1;
        } else {
            return 0;
        }
    }
}
