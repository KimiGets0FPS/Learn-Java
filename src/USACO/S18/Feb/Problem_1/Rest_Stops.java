package USACO.S18.Feb.Problem_1;

import java.io.*;
import java.util.*;

class Kattio extends PrintWriter {
    private BufferedReader r;
    private StringTokenizer st;
    public Kattio() {
        this(System.in,System.out);
    }
    public Kattio(InputStream i, OutputStream o) {
        super(o);
        r = new BufferedReader(new InputStreamReader(i));
    }

    public Kattio(String problemName) throws IOException {
        super(problemName+".out");
        r = new BufferedReader(new FileReader(problemName+".in"));
    }

    public String next() {
        try {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(r.readLine());
            return st.nextToken();
        } catch (Exception e) {}
        return null;
    }
    public int nextInt() { return Integer.parseInt(next()); }
}


public class Rest_Stops {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("reststops");

        int l = io.nextInt();
        int n = io.nextInt();
        int rf = io.nextInt();
        int rb = io.nextInt();

        int[][] stops = new int[n][2];
        for (int i = 0; i < n; i++) {
            stops[i][0] = io.nextInt();
            stops[i][1] = io.nextInt();
        }

        boolean[] good_stops = new boolean[n];
        int max = 0;
        for (int i = n-1; i >= 0; i--) {
            if (stops[i][1] > max) {
                good_stops[i] = true;
                max = stops[i][1];
            }
        }


        int prev_stop = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (good_stops[i]) {
                long travel_distance = stops[i][0] - prev_stop;
                long f_time = travel_distance * rf;
                long b_time = travel_distance * rb;
                long rest_time = f_time - b_time;
                ans += rest_time * stops[i][1];
                prev_stop = stops[i][0];
            }
        }

        io.println(ans);

        io.close();
    }
}
