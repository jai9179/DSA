package Introduction;

/*Given two integers A and B. A represents the count of mangoes and B represent the count of slices of mangoes. Mango can be cut into three slices of mangoes. A glass of mango shake can be formed by two slices of mangoes.

Find the maximum number of glasses of mango shakes you can make with A mangoes and B slices of mangoes initially.
For Example
Input 1:
    A = 19
    B = 0
Output 1:
    28
Input 2:
    A = 7
    B = 1
Output 2:
    11 */
public class Makeit {
    public static void main(String[] args) {
        // int A = 19;
        // int B = 0;
        int A = 7;
        int B = 1;
        int result = solve(A, B);
        System.out.println(result);

    }

    public static int solve(int A, int B) {
        int slice = (A * 3) + B;
        return slice / 2;
    }
}
