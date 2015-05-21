/**
 * Project: Project1                                            
 * Account: CS30100_28           
 * Author: Taban Cosmos                        
 * Creation date:                                     
 * Completion time: 6 hours                                        
 *                                                              
 * Honor Code: I pledge that this program represents my         
 *   own program code.                     
 */

package package3;
import java.util.Iterator;

public class Knight implements Application 
{

    public static byte count = 1;
    public static final byte DEAD_END = 0;
    protected Position start,
            finish;
    protected byte[][] grid;

    /**
     * Initializes this Knight object from user
     *
     * @param rows
     * @param columns
     * @param start
     */
    public Knight(byte x, byte y, Position start) {
        grid = new byte[x][y];
        this.start = start;
    } // constructor

    /**
     * getStart Method
     *
     * @return start
     */
    public Position getStart() {
        return start;
    } // method getStart

    /**
     * getFinish Method
     *
     * @return finish
     */
    public Position getFinish() {
        return finish;
    } // method getFinish

    /**
     * Returns a 2-dimensional array that holds a copy of the knight
     * configuration.
     *
     * @return - a 2-dimensional array that holds a copy of the knight
     * configuration.
     *
     */
    public byte[][] getGrid() {
        byte[][] gridCopy = new byte[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                gridCopy[i][j] = grid[i][j];
            }
        }
        return gridCopy;
    } // method gridCopy

    /**
     * Determines if a given position is legal and not a dead end.
     *
     * @param pos - the given position.
     *
     * @return true if pos is a legal position and not a dead end.
     */
    @Override
    public boolean isOK(Position pos) {
        return pos.getRow() >= 0 && pos.getRow() < grid.length && pos.getColumn()
                >= 0 && pos.getColumn() < grid[0].length
                && grid[pos.getRow()][pos.getColumn()] == 0;

    }//method isOk

    /**
     * Indicates that a given position is possibly on a path to a goal.
     *
     * @param pos the position that has been marked as possibly being on a path
     * to a goal.
     */
    @Override
    public void markAsPossible(Position pos) {
        if (this.isOK(pos)) {
            grid[pos.getRow()][pos.getColumn()] = count;
            count++;
        }

    }//method markAsPossible

    /**
     * Indicates whether a given position is a goal position.
     *
     * @param pos the position that may or may not be a goal position.
     *
     * @return true if pos is a goal position; false otherwise.
     */
    @Override
    public boolean isGoal(Position pos) {
        if (count == (grid.length * grid[0].length) + 1) {
            return true;
        } else {
            return false;
        }

    }//Method isGoal

    /**
     * Indicates that a given position is not on any path to a goal position.
     *
     * @param pos the position that has been marked as not being on any path to
     * a goal position.
     */
    @Override
    public void markAsDeadEnd(Position pos) {

        grid[pos.getRow()][pos.getColumn()] = DEAD_END;
        count--;
    }//method markAsDeadEnd

    /**
     * Converts this Application object into a String object.
     *
     * @return the String representation of this Application object.
     */
    @Override
    public String toString() {
        String result = "\n";

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                result += String.valueOf(grid[row][column]) + ' ';
            }
            result += "\n";
        } // for row = 0
        return result;
    } // method toString

    /**
     * Produces an Iterator object, over elements of type Position, that starts
     * at a given position.
     *
     * @param pos - the position the Iterator object starts at.
     *
     * @return the Iterator object.
     */
    @Override
    public Iterator<Position> iterator(Position pos) {
        return new KnightIterator(pos);
    }

    protected class KnightIterator implements Iterator<Position> {

        protected int row, column, count;

        /**
         * Initializes this KnightIterator object to start at a given position.
         *
         * @param pos the position the Iterator objects starts at.
         */
        public KnightIterator(Position pos) {
            row = pos.getRow();
            column = pos.getColumn();
            count = 0;

        } // constructor

        /**
         * Does the Knight have another move it can make
         *
         * @return true if this KnightIterator object can advance; false
         * otherwise.
         */
        @Override
        public boolean hasNext() {
            return count < 8;
        } // method hasNext

        /**
         * Advances the Knight
         *
         * @return the position advanced to.
         */
        @Override
        public Position next() {
            Position nextPosition = new Position();
            switch (count++) {

                case 0:
                    nextPosition = new Position(row - 2, column + 1);
                    break;
                case 1:
                    nextPosition = new Position(row - 1, column + 2);
                    break;
                case 2:
                    nextPosition = new Position(row + 1, column + 2);
                    break;
                case 3:
                    nextPosition = new Position(row + 2, column + 1);
                    break;
                case 4:
                    nextPosition = new Position(row + 2, column - 1);
                    break;
                case 5:
                    nextPosition = new Position(row + 1, column - 2);
                    break;
                case 6:
                    nextPosition = new Position(row - 1, column - 2);
                    break;
                case 7:
                    nextPosition = new Position(row - 2, column - 1);
                    break;
            }
            return nextPosition;
        }

        /**
         * remove Method
         *
         * @throw UnsupportedOperationException
         */
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    public static void main(String[] args) {
    }
}