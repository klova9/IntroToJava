package JavaPractice.WarmUp.Boolean;

import java.util.Scanner;

public class sumDouble {
    /*
     * Given two int values, return their sum. Unless the two values are the same,
     * then return double their sum.
     */
    static int x, y = 0;

    static void sumdoable() {
        if (x == y) {
            System.out.println("The sum of " + x + " and " + y + " doubled is  " + 2 * (x + y));
        } else
            System.out.println("The sum of " + x + " and " + y + "  is  " + (x + y));
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            x = sc.nextInt();
            System.out.println("Enter second number: ");
            y = sc.nextInt();
        }
        sumDouble.sumdoable();
    }
}
