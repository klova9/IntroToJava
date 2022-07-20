package demo;

class FooCorporation {
    static double pay(double basepay, int hours) {
        if (hours > 40 && hours < 60) {
            double total = 40 * basepay + (hours - 40) * basepay*1.5;
            return total;
        } else {
            double total = hours * basepay;
            return total;
        }
    }   
     public static void main(String[] args) {
        System.out.println("Employee 1's pay is $" + pay(7.5, 35));
        System.out.println("Employee 2's pay is $" + pay(8.2, 47));
        System.out.println("Employee 3's pay is $" + pay(10, 73));

    }

}
