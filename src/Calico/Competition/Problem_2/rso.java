package Calico.Competition.Problem_2;


import java.io.*;
import java.util.*;

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

public class rso {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        for (int i = 0; i < io.nextInt(); i++) {
            int y = io.nextInt();  // When RSO was established
            String n = io.next();  // The name RSO registered with
            System.out.println(solution(y, n));
        }
        io.close();
    }
    public static String solution(int y, String n) {
        boolean flag = y <= 2010 && n.length() < 50;
        char e = n.toCharArray()[0];
        if (e >= 'A' && e <= 'Z') {
            flag = false;
        }
        if (flag) {
            return "VALID";
        }
        return "INVALID";
    }
}
