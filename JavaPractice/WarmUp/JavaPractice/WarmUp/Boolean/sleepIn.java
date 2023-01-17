package JavaPractice.WarmUp.Boolean;

import java.util.Scanner;

public class sleepIn {
    /*
     * The parameter weekday is true if it is a weekday, and the parameter vacation
     * is true if we are on vacation. We sleep in if it is not a weekday or we're on
     * vacation. Return true if we sleep in.
     */
    static boolean weekday, vacation;

    public static void sleepin() {
        if (weekday == false || vacation == true)
            System.out.println("I can sleep in");
        else
            System.out.println("I must wake up early");

    }

    static boolean parseBoolean(String input) {
        if ("t".equals(input)) {
            return true;
        } else if ("f".equals(input)) {
            return false;
        }
        throw new IllegalArgumentException("Input t for true or f for false");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Is it a weekday? (t/f) ");
            weekday = parseBoolean(sc.nextLine());
            System.out.print("Is it a vacation? (t/f) ");
            vacation = parseBoolean(sc.nextLine());
        }
        sleepIn.sleepin();
    }
}