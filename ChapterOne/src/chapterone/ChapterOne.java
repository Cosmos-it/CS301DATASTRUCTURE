package chapterone;

import java.util.Arrays;
import static java.lang.Math.pow;
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
        String a = scan.next();
        ChapterOne.convertBinaryToDecimal(a);
    }

    /**
     * Read in a string of binary number and then convert them to decimal. first
     * read the number as a string then convert it to array and perform the
     * math. Result = 0; for (i = n − 1 downto 0) Result = (Result × b ) + di
     * end for
     *
     */
    public static void convertBinaryToDecimal(String binary) {

       int result = 0;
       int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1'){
            result = result + (int)Math.pow(2, binary.length()-i-1);
            }
        }
            System.out.print(result);
    }
}