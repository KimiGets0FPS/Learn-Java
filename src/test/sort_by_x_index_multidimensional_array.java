package test;

import java.io.*;
import java.util.*;

class Kattio extends PrintWriter {
    private final BufferedReader r;
    private StringTokenizer st;

    public Kattio() {
        this(System.in, System.out);
    }
    public Kattio(InputStream i, OutputStream o) {
        super(o);
        r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(String problemName) throws IOException {
        super(new FileWriter(problemName + ".out"));
        r = new BufferedReader(new FileReader(problemName + ".in"));
    }

    public String next() {
        try {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(r.readLine());
            return st.nextToken();
        } catch (Exception ignored) { }
        return null;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    public long nextLong() {
        return Long.parseLong(next());
    }
}

public class sort_by_x_index_multidimensional_array {
    /**
     * <p>
     * This works with x-dimensional arrays </p>
     * Ex. {@code Arrays.sort(array_name, Comparator.comparingInt(a -> a[0]));}
     * <br> So the {@code a -> a[0]}'s index  an be replaced with any desired index
     */
    public static void main(String[] args) {
        int[][] test_array = {{5, 0}, {4, 1}, {3, 2}, {2, 3}, {1, 4}, {0, 5}};  // Descending Order
        Arrays.sort(test_array, Comparator.comparingInt(a -> a[0]));
        System.out.println(Arrays.deepToString(test_array));

    }
}
