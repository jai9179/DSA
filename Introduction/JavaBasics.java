package Introduction;

//Q1. Count Factors - 2 </>
/*Problem Description
Given an integer A, you need to find the count of it's factors.

Factor of a number is the number which divides it perfectly leaving no remainder.

Example : 1, 2, 3, 6 are factors of 6 */
public class JavaBasics {
    public static void main(String[] args) {
        int N = 5;
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
        return factors;
    }

}