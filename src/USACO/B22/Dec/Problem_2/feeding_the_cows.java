package USACO.B22.Dec.Problem_2;

// http://usaco.org/index.php?page=viewproblem&cpid=1240

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

public class feeding_the_cows {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);
        
        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            int n = io.nextInt();
            int k = io.nextInt();
            ArrayList<String> c = new ArrayList<>();
            for (char character : io.next().toCharArray()) {
                c.add(String.valueOf(character));
            }

        }
        
        io.close();
    }

//    public static ArrayList<String> solution(int n, int k, ArrayList<String> c) {
//        return {};
//    }
}
