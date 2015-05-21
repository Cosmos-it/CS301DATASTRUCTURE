/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package3;

import java.util.Iterator;
import junit.framework.TestCase;

/**
 *
 * @author Onwer
 */
public class KnightTest extends TestCase {
    
    public KnightTest(String testName) {
        super(testName);
    }

    /**
     * Test of getStart method, of class Knight.
     */
    public void testGetStart() {
        System.out.println("getStart");
        Knight instance = null;
        Position expResult = null;
        Position result = instance.getStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFinish method, of class Knight.
     */
    public void testGetFinish() {
        System.out.println("getFinish");
        Knight instance = null;
        Position expResult = null;
        Position result = instance.getFinish();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGrid method, of class Knight.
     */
    public void testGetGrid() {
        System.out.println("getGrid");
        Knight instance = null;
        byte[][] expResult = null;
        byte[][] result = instance.getGrid();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOK method, of class Knight.
     */
    public void testIsOK() {
        System.out.println("isOK");
        Position pos = null;
        Knight instance = null;
        boolean expResult = false;
        boolean result = instance.isOK(pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of markAsPossible method, of class Knight.
     */
    public void testMarkAsPossible() {
        System.out.println("markAsPossible");
        Position pos = null;
        Knight instance = null;
        instance.markAsPossible(pos);
    }

    /**
     * Test of isGoal method, of class Knight.
     */
    public void testIsGoal() {
        System.out.println("isGoal");
        Position pos = null;
        Knight instance = null;
        boolean expResult = false;
        boolean result = instance.isGoal(pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of markAsDeadEnd method, of class Knight.
     */
    public void testMarkAsDeadEnd() {
        System.out.println("markAsDeadEnd");
        Position pos = null;
        Knight instance = null;
        instance.markAsDeadEnd(pos);
    }

    /**
     * Test of toString method, of class Knight.
     */
    public void testToString() {
        System.out.println("toString");
        Knight instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of iterator method, of class Knight.
     */
    public void testIterator() {
        System.out.println("iterator");
        Position pos = null;
        Knight instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator(pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class Knight.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Knight.main(args);
    }
}
