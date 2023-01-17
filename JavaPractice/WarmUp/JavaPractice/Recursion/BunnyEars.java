package JavaPractice.Recursion;

public class BunnyEars {
    /*
     * We have a number of bunnies and each bunny has two big floppy ears. We want
     * to compute the total number of ears across all the bunnies recursively
     * (without loops or multiplication).
     */
    static void bunnyEars(int numberofBunnys) {
        System.out.println(numberofBunnys > 0 ? (numberofBunnys - 1) + numberofBunnys + 1 : 0);

    }

    public static void main(String[] args) {
        BunnyEars.bunnyEars(0);
        BunnyEars.bunnyEars(1);
        BunnyEars.bunnyEars(2);
        BunnyEars.bunnyEars(3);
        BunnyEars.bunnyEars(4);

    }
}
