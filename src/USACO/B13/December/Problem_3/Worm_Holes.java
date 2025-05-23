package USACO.B13.December.Problem_3;

import java.io.*;
import java.util.*;

public class Worm_Holes {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.nextInt();
        String[][] cows = new String[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                cows[i][j] = io.next();
            }
        }
        io.println(Arrays.deepToString(cows));

        io.close();
    }
}

class Kattio extends PrintWriter {
    private final BufferedReader r;
    private StringTokenizer st;

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