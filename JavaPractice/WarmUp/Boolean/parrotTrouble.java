package JavaPractice.WarmUp.Boolean;

public class parrotTrouble {
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
