package USACO.B22.Dec.Problem_3;

// http://usaco.org/index.php?page=viewproblem&cpid=1241

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

public class reverse_engineering {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int t = io.nextInt();
        for (int i = 0; i < t; i++) {
            int n = io.nextInt();
            int m = io.nextInt();
            String[] in = new String[m];
            boolean[] out = new boolean[m];
            for (int j = 0; j < m; j++) {
                in[j] = io.next();
                out[j] = Objects.equals(io.next(), "1");
            }
//            io.println(solution(in, out));
        }

        io.close();
    }

//    public static String solution(String[] in, boolean[] out) {
////        Map<String, Boolean> ok = new HashMap<>();
//        for (String s : in) {
//            for (int j = 0; j < s.length(); j++) {
//
//            }
//        }
//    }
}
