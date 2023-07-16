package USACO.S19.Jan.Problem_1;

import java.io.*;
import java.util.*;

class Kattio extends PrintWriter {
    private BufferedReader r;
    private StringTokenizer st;

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
        }
        catch (Exception e) {}
        return null;
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public double nextDouble() { return Double.parseDouble(next()); }
    public long nextLong() { return Long.parseLong(next()); }
}


public class Grass_Planting {
    public static int[] field = new int[1000000];
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("planting");
        
        int n = io.nextInt()-1;

        for (int i = 0; i < n; i++) {
            int a = io.nextInt();
            int b = io.nextInt();
            field[a-1] ++;
            field[b-1] ++;
        }

        int output = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i] > output) {
                output = field[i];
            }
        }
        
        io.println(output+1);

        io.close();
    }
}
