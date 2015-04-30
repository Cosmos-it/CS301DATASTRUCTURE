package projecttwo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Taban
 */
public class SequenceTest {

    public SequenceTest() {

    }

    //Fields.
    private final int ONE = 1;
    private final int TWO = 2;
    private final int THREE = 3;

    /**
     * Test of size method, of class Sequence.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Sequence instance = new Sequence();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of append method, of class Sequence.
     */
    @Test
    public void testAppend() {
        Sequence instance = new Sequence();
        System.out.println("append");
        instance.append(ONE);
        instance.append(TWO);

        int i = instance.size();
        int a = 2;
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(a, i);
    }

    /**
     * Test of get method, of class Sequence.
     */
    @Test
    public void testGet() {
        Sequence instance = new Sequence();
        System.out.println("get");
        int k = 0;
        instance.append(ONE);
        Object expected = 1;
        Object result = instance.get(k);
        assertEquals(expected, result);
    }

    /**
     * Test of set method, of class Sequence.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int k = 2;        
        Sequence instance = new Sequence();
        instance.append(ONE);
        instance.append(TWO);
        instance.append(THREE);
        instance.set(k, 19);

        assertEquals(19, instance.get(k));
    }

}
