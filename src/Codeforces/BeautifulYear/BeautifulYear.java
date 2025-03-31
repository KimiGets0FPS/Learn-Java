package Codeforces.BeautifulYear;


import java.io.*;
import java.util.*;


public class BeautifulYear {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);
        
        int year = io.nextInt();
        while (true) {
            year += 1;
            int a = year/1000, b = year / 100 % 10, c = year / 10 % 10, d = year % 10;
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                break;
            }
        }

        System.out.println(year);

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