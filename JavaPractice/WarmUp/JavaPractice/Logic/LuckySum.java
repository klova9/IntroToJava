package JavaPractice.Logic;

public class LuckySum {
    /*
     * Given 3 int values, a b c, return their sum. However, if one of the values is
     * 13 then it does not count towards the sum and values to its right do not
     * count. So for example, if b is 13, then both b and c do not count
     */
    static void loneSum(int alpha, int bravo, int charlie) {
        if (alpha == 13) {
            System.out.println(0);

        } else if (bravo == 13) {
            System.out.println(alpha);

        } else if (charlie == 13) {
            System.out.println(alpha + bravo);

        } else {
            System.out.println(alpha + bravo + charlie);
        }
    }

    public static void main(String[] args) {
        LuckySum.loneSum(1, 2, 3);
        LuckySum.loneSum(1, 2, 13);
        LuckySum.loneSum(1, 13, 3);

    }
}