/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package3;

import junit.framework.TestCase;

/**
 *
 * @author Onwer
 */
public class KnightUserTest extends TestCase {
    
    public KnightUserTest(String testName) {
        super(testName);
    }

    /**
     * Test of main method, of class KnightUser.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        KnightUser.main(args);
    }

    /**
     * Test of run method, of class KnightUser.
     */
    public void testRun() {
        System.out.println("run");
        KnightUser instance = new KnightUser();
        instance.run();
    }

    /**
     * Test of searchBoard method, of class KnightUser.
     */
    public void testSearchBoard() {
        System.out.println("searchBoard");
        Knight knight = null;
        KnightUser instance = new KnightUser();
        boolean expResult = false;
        boolean result = instance.searchBoard(knight);
        assertEquals(expResult, result);
    }
}
