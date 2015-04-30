package projectone;

import java.util.ArrayList;

/**
 *
 * @author Taban
 * 
 * This is the expected solution
 *  x        =  (3.0, 2.0, 2.0, 22.0)
 *  y        =  (55.0, 22.0, 42.0, .0)
 *  x + y    =  (2.0, 5.0, 7.0, 5.0)
 *  10x      =  (1.0, 20.0, 5.0, 10.0)
 *  |x|      =  5.15
 *  <x, y>   =  35.0
 *  |x - y|  =  5.55
 * 
 * This vector class is not a java vector it
 * is built from scratch!
 *
 */
public class MyVector {

    private final ArrayList<Double> data;
    private final int N;

    public MyVector(double[] data) {
        N = data.length;
        // defensive copy so that client can't alter our copy of data[]
        this.data = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            this.data.add(data[i]);
        }
    }

    // create the zero vector of length N
    public MyVector(int N) {
        this.N = N;
        this.data = new ArrayList<>(N);
    }

    // return the length of the vector
    public int length() {
        return N;
    }

    /** return the inner product of this Vector a and b
     * 
     * @param thatVector
     * @return sum
     */
    
    public double dot(MyVector thatVector) {
        if (this.N != thatVector.N) {
            throw new RuntimeException("Dimensions don't agree");
        }
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum = sum + (this.data.get(i) * thatVector.data.get(i));
        }
        return sum;
    }

    /** return this + thatVector
     * 
     * @param thatVector
     * @return 
     */
    public MyVector plus(MyVector thatVector) {
        if (this.N != thatVector.N) {
            throw new RuntimeException("Dimensions don't agree");
        }
        MyVector c = new MyVector(N);
        for (int i = 0; i < N; i++) {
            c.data.add(this.data.get(i) + thatVector.data.get(i));
        }
        return c;
    }

    /** return this - thatVector
     * 
     * @param thatVector
     * @return 
     */
    public MyVector minus(MyVector thatVector) {
        if (this.N != thatVector.N) {
            throw new RuntimeException("Dimensions don't agree");
        }
        MyVector c = new MyVector(N);
        for (int i = 0; i < N; i++) {
            c.data.add(this.data.get(i) - thatVector.data.get(i));
        }
        return c;
    }

    /** create and return a new object whose value is (this * factor)
     * 
     * @param factor
     * @return 
     */
    public MyVector multiply(double factor) {
        MyVector c = new MyVector(N);
        for (int i = 0; i < N; i++) {
            c.data.add(factor * this.data.get(i));
        }
        return c;
    }

    /** scale the values in the array. (Multiply by a double)
     * 
     * @param scale
     * @return 
     */
    public MyVector scaledBy(double scale) {
        double[] sum = new double[data.size()];
        for (int i = 0; i < data.size(); i++) {
            sum[i] = scale * this.data.get(i);
        }
        return new MyVector(sum);
    }

    /** return absolute value |abs|
     * 
     * @param vector
     * @return 
     */
    public MyVector abs(MyVector vector) {
        double[] absValue = new double[data.size()];
        for (int i = 0; i < this.data.size(); i++) {
            absValue[i] = Math.sqrt(Math.pow(vector.data.get(i), 2));
        }
        return new MyVector(absValue);

    }

    /** check the equality (Length) for the vectors
     * 
     * @param vector
     * @return 
     */
    public boolean equals(MyVector vector) {
        for (int i = 0; i < data.size(); i++) {
            if (!vector.data.get(i).equals(data.get(i))) {
                return false;
            }
        }
        return true;
    }

    /** return a string representation of the vector
     * 
     * @return 
     */
    @Override
    public String toString() {
        String outPut = "{";
        for (int i = 0; i < N; i++) {
            outPut += data.get(i);
            if (i < N - 1) {
                outPut += ", ";
            }
        }
        return outPut + "}";
    }

}
