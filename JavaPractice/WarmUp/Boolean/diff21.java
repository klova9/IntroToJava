package JavaPractice.WarmUp.Boolean;

public class diff21 {
    static void absDiff(int n) {
        int diff = 0;
        if (n > 21) {
            diff = Math.abs(21 - n) * 2;
            System.out.println("Double the difference between 21 and " + n + " is " + diff);

        }

        else {
            diff = Math.abs(21 - n);
            System.out.println("The difference between 21 and " + n + " is " + diff);
        }
    }

    public static void main(String[] args) {
        diff21.absDiff(2);
        diff21.absDiff(11);
        diff21.absDiff(0);
        diff21.absDiff(42);
    }
}