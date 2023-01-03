import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.lang.model.type.TypeVisitor;

public class mathCalc {
    static double radius = 0.0;
    static double circleArea = 0.0;
    static int feet = 0;
    static int inches = 0;

    public static void Feet(double circleArea) {
        radius = Math.sqrt(circleArea / Math.PI);
        feet = (int) Math.floor(radius);
        String plu;
        if (feet >= 1) {
            plu = " foot ";
        } else {
            plu = " feet ";
        }
        System.out.print("The radius of a circle with area " + circleArea + " is " + feet + plu);

    }

    public static void Inches(double circleArea) {
        inches = (int) Math.round(12.0 * (radius - feet));
        String plu;
        if (inches >= 1) {
            plu = "  inch ";
        } else {
            plu = " inches ";
        }
        System.out.print(inches + plu);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter circle area: ");
            circleArea = sc.nextDouble();
        } catch (NoSuchElementException | NumberFormatException e) {
            System.out.println("Enter a valid number");

        }

        mathCalc.Feet(circleArea);
        mathCalc.Inches(circleArea);
    }
}