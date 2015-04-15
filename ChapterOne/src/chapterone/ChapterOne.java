package chapterone;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Taban
 * @date 04/07/15
 * @course311s
 * @instructor Barisk
 */
public class ChapterOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a binary");
        String result = scan.next();
        int printout = ChapterOne.convertBinaryToDecimal(result);
        System.out.println("Decimal! ");
        System.out.println(printout);
        System.out.println(" ");

        System.out.println("Insert your decimal to reverse it! ");
        int a = scan.nextInt();
        System.out.println("Binary! ");
        String be = ChapterOne.convertDecimalToBinary(a);
        System.out.println(be);
    }

    /**
     * Read in a string of binary number and then convert them to decimal. first
     * read the number as a string then convert it to array and perform the
     * math. Result = 0; for (i = n − 1 down to 0) Result = (Result × b ) + d[i]
     * end for
     *
     * @param number
     * @return
     */
    public static int convertBinaryToDecimal(String number) {

        int result = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            if (number.charAt(i) == '1') {
                result = result + (int) Math.pow(2, number.length() - i - 1);
            }
        }
        return result;
    }

    /**
     * Converting from Decimal to Binary
     *
     * @param number
     * @return
     */
    
    public static String convertDecimalToBinary(int number) {

        if (number == 0) {
            return "0";
        }
        //Store reminders created and then return it
        //as a string.
        StringBuilder string = new StringBuilder();
        while (number > 0) {
            int rem = number % 2;
            string.append(rem);
            number = number / 2;
        }
        return string.reverse().toString();
    }
}
