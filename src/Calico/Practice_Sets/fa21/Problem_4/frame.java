package Calico.Practice_Sets.fa21.Problem_4;

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

public class frame {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);
        
        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            String[] words = io.next().split(" ");
            String[] result = solution(words);
            for (String s : result) {
                System.out.println(s);
            }
        }
        
        io.close();
    }
    public static String[] solution(String[] words) {
        String[] result = new String[words.length + 2];
        int m = words[0].length();
        for (int i = 1; i < words.length; i++) {
            m = Math.max(m, words[i].length());
        }
        String beginning_end = "*".repeat(Math.max(0, m + 2));
        result[0] = beginning_end;
        result[result.length-1] = beginning_end;
        for (int i = 1; i < result.length-1; i++) {
            String n = "*" +
                    words[i - 1] +
                    " ".repeat(m - words[i - 1].length()) +
                    "*";
            result[i] = n;
        }
        return result;
    }
}
