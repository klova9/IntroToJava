package FooCorp;

class FooCorporation {
    FooCorporation() {
    }

    static double pay(double d, int n) {
        if (n > 40 && n < 60) {
            double d2 = 40.0 * d + (double) (n - 40) * d * 1.5;
            return d2;
        }
        double d3 = (double) n * d;
        return d3;
    }

    public static void main(String[] stringArray) {
        System.out.println("Employee 1's pay is $" + FooCorporation.pay(7.5, 35));
        System.out.println("Employee 2's pay is $" + FooCorporation.pay(8.2, 47));
        System.out.println("Employee 3's pay is $" + FooCorporation.pay(10.0, 73));
    }
}
