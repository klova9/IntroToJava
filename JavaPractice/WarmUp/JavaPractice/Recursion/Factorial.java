package JavaPractice.Recursion;

public class Factorial {
    /*
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2)
     * ... 1. Compute the result recursively (without loops).
     */
    static void factorial(int n) {
        System.out.println((n > 1 ? n * (n - 1) : 1));
    }

    public static void main(String[] args) {
        Factorial.factorial(1);
        Factorial.factorial(2);
        Factorial.factorial(3);
    }
}
