package USACO.B18.Feb.Problem_3;

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
        super(problemName + ".out");
        r = new BufferedReader(new FileReader(problemName + ".in"));
    }

    public String next() {
        try {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(r.readLine());
            return st.nextToken();
        } catch (Exception ignored) {
        }
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



public class Taming_the_Herd {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("taming");
        
        int n = io.nextInt();
        int[] log = new int[n];
        for (int i = 0; i < n; i++) {
            log[i] = io.nextInt();
        }

        solution(n, log);
        
        io.close();
    }

    public static void solution(int n, int[] log) {

    }
}
