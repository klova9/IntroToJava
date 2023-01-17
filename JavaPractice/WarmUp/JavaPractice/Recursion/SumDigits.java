package JavaPractice.Recursion;

/* Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */
public class SumDigits {
    static void sumDigit(int n) {
        System.out.println(n > 0 ? ((n % 10) + ((n / 10) % 10) + (n / 100)) : null);
    }

    public static void main(String[] args) {
        SumDigits.sumDigit(126);
        SumDigits.sumDigit(49);
        SumDigits.sumDigit(12);

    }
}
