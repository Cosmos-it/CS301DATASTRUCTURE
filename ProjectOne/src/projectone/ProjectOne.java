package projectone;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @project: ProjectOne
 * @account: CS30100_28
 * @author Taban Cosmos
 * @creation date: 4/20/15
 * @completion time: 7hours with periodic stops
 *
 * @Honor code: I pledge that this program represents my own program code.
 */
public class ProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Using Lists to store inputs
        //Then storing the inputs into double array
        List vector1 = new ArrayList<>();
        List vector2 = new ArrayList<>();
        double c1 = 0;
        double c2 = 0;
        boolean inPut1 = true;
        boolean inPut2 = true;
        printOut(c1, vector1, inPut1, c2, vector2, inPut2);

    }

    //This method prints out the output being calculated in
    //the MyVector class
    private static void printOut(double c1, List vector1,
            boolean inPut1, double c2, List vector2, boolean inPut2) {
        double multiplier;
        Scanner sc = new Scanner(System.in);

        //First coordinates input
        System.out.println("Enter Multiplier for scalar product: ");
        multiplier = sc.nextDouble();
        System.out.println("Enter vector 1 cordinates or enter"
                + " 0 to finish: ");
        do {
            try {
                c1 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please Enter a valid "
                        + "Number for Vector 1: ");
                sc = new Scanner(System.in);
                sc.nextDouble();
            }
            if (c1 == 0) {
                break;
            }
            vector1.add(c1);
        } while (inPut1);
        double[] initvalues1 = new double[vector1.size()];
        for (int i = 0; i < initvalues1.length; i++) {

            initvalues1[i] = (double) vector1.get(i);
        }

        //Second coordinates input
        System.out.println("Enter vector 2 coordinates: 0 for done!");
        do {
            try {
                c2 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Enter Valid coordinates for vector2: ");
                sc = new Scanner(System.in);
                sc.nextDouble();
            }
            if (c2 == 0) {
                break;
            }
            vector2.add(c2);
        } while (inPut2);
        double initvalues2[] = new double[vector2.size()];
        for (int i = 0; i < vector2.size(); i++) {
            initvalues2[i] = (double) vector2.get(i);
        }
        MyVector x = new MyVector(initvalues1);
        MyVector y = new MyVector(initvalues2);

        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println("Vector equals: " + x.equals(y));
        System.out.println("Vector dot: " + x.dot(y));
        System.out.println("Vector minus: " + x.minus(y));
        System.out.println("Vector plus: " + x.plus(y));
        System.out.println("Vector scaleby: " + x.scaledBy(multiplier));
        System.out.println("Vector scaleby: " + y.scaledBy(multiplier));
        System.out.println("Vector abs: " + x.abs(x));
        System.out.println("Vector abs: " + y.abs(y));

    }

}
