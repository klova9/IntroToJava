package JavaPractice.Recursion;

public class Fibonancci {
    /*
     * The fibonacci sequence is a famous bit of mathematics, and it happens to have
     * a recursive definition. The first two values in the sequence are 0 and 1
     * (essentially 2 base cases). Each subsequent value is the sum of the previous
     * two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
     * Define a recursive fibonacci(n) method that returns the nth fibonacci number,
     * with n=0 representing the start of the sequence.
     */
    static void fibonacci(int n) {
        System.out.println(n > 1 ? (n - 1) + (n - 2) : n);
    }

    public static void main(String[] args) {
        Fibonancci.fibonacci(0);
        Fibonancci.fibonacci(1);
        Fibonancci.fibonacci(2);
        Fibonancci.fibonacci(3);

    }

}
