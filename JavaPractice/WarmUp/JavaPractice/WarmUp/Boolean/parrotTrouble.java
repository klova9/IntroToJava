package JavaPractice.WarmUp.Boolean;

public class parrotTrouble {
    /*
     * We have a loud talking parrot. The "hour" parameter is the current hour time
     * in the range 0..23. We are in trouble if the parrot is talking and the hour
     * is before 7 or after 20. Return true if we are in trouble.
     */
    public static void parrottrouble(boolean talking, int hour) {
        System.out.println((hour < 7 || hour > 20) && talking
        ? "We are in trouble" : "We are safe");
    }

    public static void main(String[] args) {
        parrotTrouble.parrottrouble(true, 6);
        parrotTrouble.parrottrouble(true, 7);
        parrotTrouble.parrottrouble(false, 6);
    }
}
