package Calico.Competition.Problem_3;

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


public class paint {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);
        
        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            int w = io.nextInt();
            int o = io.nextInt();
            int b = io.nextInt();
            int cow = io.nextInt(); // cost to convert orange to white || white to orange
            int cbo = io.nextInt(); // cost to convert brown to orange || orange to brown
            int cbw = io.nextInt(); // cost to convert brown to white || white to brown
            // THESE CONVERSIONS ARE BIDIRECTIONAL
//            System.out.println(solution(w, o, b, cow, cbo, cbw));
        }
        
        io.close();
    }
//    public static int solution(int w, int o, int b, int cow, int cbo, int cbw) {
//
//        return cost;
//    }
}
