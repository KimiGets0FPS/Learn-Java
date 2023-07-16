package USACO.B22.Dec.Problem_1;

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

public class cow_college {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        long n = io.nextLong();

        ArrayList<Long> c = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            c.add(io.nextLong());
        }
        TreeSet<Long> new_costs = new TreeSet<>(c);

        long max_profit = -1;
        long charge = -1;

        for (Long new_cost : new_costs) {
            int attending = 0;
            for (Long aLong : c) {
                if (new_cost <= aLong) {
                    attending ++;
                }
            }

            if ((attending * new_cost) > (max_profit)) {
                max_profit = (attending * new_cost);
                charge = new_cost;
            }
        }

        io.println(max_profit + " " + charge);

        io.close();
    }
}
