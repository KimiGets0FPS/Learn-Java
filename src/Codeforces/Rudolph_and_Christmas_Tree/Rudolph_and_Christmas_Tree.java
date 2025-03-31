package Codeforces.Rudolph_and_Christmas_Tree;

import java.io.*;
import java.util.*;


class Kattio extends PrintWriter {
    private final BufferedReader r;
    private StringTokenizer st;
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
        } catch (Exception ignored) {}
        return null;
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public double nextDouble() { return Double.parseDouble(next()); }
    public long nextLong() { return Long.parseLong(next()); }
}


public class Rudolph_and_Christmas_Tree {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int t = io.nextInt();
        for (int i = 0; i < t; i++) {
            int n = io.nextInt(), d = io.nextInt(), h = io.nextInt();
            int[] heights = new int[n];
            for (int j = 0; j < n; j++) {
                heights[j] = io.nextInt();
            }
            solution(n, d, h, heights);
        }


        io.close();
    }

    public static void solution(int n, int d, int h, int[] heights) {

    }
}
