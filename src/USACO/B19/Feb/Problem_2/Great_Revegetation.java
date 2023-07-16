package USACO.B19.Feb.Problem_2;

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



public class Great_Revegetation {
    public static List<int[]> pastures = new ArrayList<>();
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio("revegetate");
        
        int n = io.nextInt();
        int m = io.nextInt();

        for (int i = 0; i < m; i++) {
            int[] pasture = new int[2];
            pasture[0] = io.nextInt();
            pasture[1] = io.nextInt();
            pastures.add(pasture);
        }



        // output
        for (int i = 0; i < n; i++) {
            io.print("");
        }
        io.print("\n");
        
        io.close();
    }
}
