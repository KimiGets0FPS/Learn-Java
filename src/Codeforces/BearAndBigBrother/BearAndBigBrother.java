package Codeforces.BearAndBigBrother;


import java.io.*;
import java.util.*;


public class BearAndBigBrother {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int a = io.nextInt();
        int b = io.nextInt();

        if (a == b) {
            System.out.println(1);
        }
        else {
            int years = 0;
            while (a <= b) {
                a *= 3;
                b *= 2;
                years++;
            }
            System.out.println(years);
        }

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
        } catch (Exception ignored) {}
        return null;
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public double nextDouble() { return Double.parseDouble(next()); }
    public long nextLong() { return Long.parseLong(next()); }
}
