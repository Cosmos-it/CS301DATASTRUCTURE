package projecttwo;

/**
 * @project: ProjectOne
 * @account: CS30100_28
 * @author Taban Cosmos
 * @creation date: 4/28/15
 * @completion time: 3 hours with periodic stops
 *
 * @Honor code: I pledge that this program represents my own program code.
 */
/**
 * @param <E>
 */
public class Sequence<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;
    private int size;

    /**
     * Initializes this Sequence object to be empty, with an initial capacity of
     * ten elements.
     */
    public Sequence() {
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    /**
     * Initializes this Sequence object to be empty, with a specified initial
     * capacity.
     *
     * @param n
     * @throw IllegalArgumentException – if capacity is non-positive.
     *
     */
    public Sequence(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Illegal arguement: " + n);
        }
        this.data = (E[]) new Object[n];
    }

    /**
     * Returns the number of elements in this Sequence object.
     * @return the number of elements in this Sequence object. *
     */
    public int size() {
        return size;
    }

    /**
     * Appends a specified element to this Sequence object.
     * @param e
     */
    public void append(E e) {
        ensureCapacity();
        int index = 0;
        // Move the elements to the right after the specified index
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        // Insert new element to data[index]
        data[index] = e;

        // Increase size by 1
        size++;
    }

    /**
     * Create a new larger array, double the current size + 1
     */
    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    /**
     * Returns the element at a specified index in this Sequence object. The
     * worstTime(n) is constant, where n is the number of elements in this *
     * Sequence object
     *
     * @param k – the index of the element returned.
     * @return
     */
    public E get(int k) {
        if (k < 0 || k >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[k];
    }

    /**
     * Changes the element at a specified index in this Sequence object. The
     * worstTime(n) is constant, where n is the number of elements in this 
     * Sequence object.
     *
     * @param k
     * @param newElement
     */
    public void set(int k, E newElement) {
        if (k < 0 || k >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E old = data[k];
        data[k] = newElement;
    }
}
