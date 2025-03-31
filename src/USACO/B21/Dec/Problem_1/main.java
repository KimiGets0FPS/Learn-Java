package USACO.B21.Dec.Problem_1;

import java.io.*;
import java.util.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.in;

class Kattio extends PrintWriter {
    private final BufferedReader r;
    private StringTokenizer st;

    // standard input
    public Kattio() {
        this(in, System.out);
    }

    public Kattio(InputStream i, OutputStream o) {
        super(o);
        r = new BufferedReader(new InputStreamReader(i));
    }

    // USACO-style file input
    public Kattio(String problemName) throws IOException {
        super(problemName + ".out");
        r = new BufferedReader(new FileReader(problemName + ".in"));
    }

    // returns null if no more input
    public String next() {
        try {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(r.readLine());
            return st.nextToken();
        } catch (Exception e) {
        }
        return null;
    }

    public int nextInt() {
        return parseInt(next());
    }

    public double nextDouble() {
        return parseDouble(next());
    }

    public long nextLong() {
        return parseLong(next());
    }
}

public class main {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.nextInt();
        String cows = io.next();

        int count = 0;
        for (int i = 1; i < n-1; i++) {
            if (cows.charAt(i) != cows.charAt(i-1) && cows.charAt(i) != cows.charAt(i+1)) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
