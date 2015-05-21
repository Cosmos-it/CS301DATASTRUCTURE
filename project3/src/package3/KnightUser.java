package package3;
import java.io.*;
import java.util.*;

public class KnightUser {

    final String ILLEGAL_START = "Illegal Starting Position";
    final String PASSED = "\n\nYou have found an answer";
    final String FAIL = "\n\nThere is not a solution witht this board/starting position";
    BackTrack backTrack;

    public static void main(String[] args) {
        new KnightUser().run();
    } // method main

    /**
     * run Method
     * 
     * get the boards dimensions and the starting pos from the user
     */
    public void run() {

        System.out.print("Enter an integer to be the boards dimensions: ");
        Scanner keyboard = new Scanner(System.in);
        byte rows = keyboard.nextByte();
        byte columns = rows;
        System.out.print("Enter the starting row and column: ");
        Position start = new Position(keyboard.nextInt() - 1, keyboard.nextInt() - 1);
        boolean isValid = false;
        
        while (!isValid) {
            try {
                Knight knight = new Knight(rows, columns, start);
                if (!knight.isOK(knight.getStart())) {
                    System.out.println(ILLEGAL_START);
                } else {
                    if (searchBoard(knight)) {
                        System.out.println(PASSED);
                    } else {
                        System.out.println(FAIL);
                    }
                    System.out.println(knight);
                } // else 
                isValid = true;
            } // try
            catch (NumberFormatException e) {
                System.out.println("\n" + e);
            } // catch
            catch (RuntimeException e) {
                System.out.println("\n" + e);
            } // catch
        }// while
    } // method run

    /**
     * Performs the Board search.
     *
     * @param knight – the knight to traverse that board.
     *
     * @return true - if a path from start to finish was found; otherwise, 
     * false
     */
    public boolean searchBoard(Knight knight) {
        Position start = knight.getStart();
        knight.markAsPossible(start);
        backTrack = new BackTrack(knight);
        if (knight.isGoal(start) || backTrack.tryToReachGoal(start)) {
            return true;
        }
        knight.markAsDeadEnd(start);
        return false;
    } // method searchMaze
} // class MazeUser