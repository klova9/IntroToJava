package JavaPractice.Recursion;

public class BunnyEars2 {
    /*
     * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3,
     * ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3
     * ears, because they each have a raised foot. Recursively return the number of
     * "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
     */
    static void bunnyEars(int numberofBunnys) {
        System.out.println(numberofBunnys % 2 == 0 && numberofBunnys > 0 ? (numberofBunnys - 1) + numberofBunnys + 2
                : (numberofBunnys - 1) + numberofBunnys + 1);

    }

    public static void main(String[] args) {
        BunnyEars2.bunnyEars(0);
        BunnyEars2.bunnyEars(1);
        BunnyEars2.bunnyEars(2);
        BunnyEars2.bunnyEars(3);

    }
}
