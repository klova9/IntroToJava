package JavaPractice.WarmUp.Boolean;

public class monkeyTrouble {
    public static void Monkey(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile))
            System.out.println("Prepare for monkey trouble!");
        else
            System.out.println("We are safe");
    }

    public static void main(String[] args) {
        monkeyTrouble.Monkey(true, true);
        monkeyTrouble.Monkey(true, false);

        monkeyTrouble.Monkey(false, false);

    }

}
