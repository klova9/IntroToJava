package JavaPractice.WarmUp.Boolean;

public class monkeyTrouble {
    /*
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
     * if each is smiling. We are in trouble if they are both smiling or if neither
     * of them is smiling. Return true if we are in trouble.
     */
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
