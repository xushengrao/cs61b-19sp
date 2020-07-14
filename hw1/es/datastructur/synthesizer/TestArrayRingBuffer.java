package es.datastructur.synthesizer;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the ArrayRingBuffer class.
 *  @author Josh Hug
 */

public class TestArrayRingBuffer {
    @Test
    public void someTest() {
        ArrayRingBuffer<Integer> arb = new ArrayRingBuffer<>(3);
        assertTrue(arb.isEmpty());
        arb.peek();
        StdOut.println(arb.peek());
        arb.enqueue(1);
        StdOut.println(arb.peek());
        arb.enqueue(2);
        arb.enqueue(3);
        assertTrue(arb.isFull());
        assertEquals((Integer)1, arb.dequeue());
        assertFalse(arb.isFull());
        assertEquals((Integer) 2, arb.peek());
        arb.enqueue(4);
        assertTrue(arb.isFull());
    }
}
