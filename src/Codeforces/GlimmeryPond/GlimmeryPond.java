package Codeforces.GlimmeryPond;


import java.io.*;
import java.util.*;


public class GlimmeryPond {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.nextInt();
        int m = io.nextInt();
        int k = io.nextInt();


    }
}


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
