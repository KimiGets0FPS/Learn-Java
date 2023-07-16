package Calico.Practice_Sets.fa21.Problem_1;

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
}

public class car {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            String[] in = io.next().split(":");
            float v = Float.parseFloat(in[0]);
            float x = Float.parseFloat(in[1]);
            System.out.println(decide(v, x));
        }
        
        io.close();
    }
    public static String decide(float v, float x) {
        if (x / v <= 1) {
            return "SWERVE";
        }
        else if (x / v <= 5 && x / v > 1) {
            return "BRAKE";
        }
        return "SAFE";
    }
}
