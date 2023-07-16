package USACO.B17.Jan.Problem_3;

import java.io.*;
import java.util.*;


class Kattio extends PrintWriter {
    private final BufferedReader r;
    private StringTokenizer st;

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
        catch (Exception ignored) {}
        return null;
    }
    public int nextInt() {
        return Integer.parseInt(next());
    }
}


public class Cow_Tipping {
    static boolean[][] cows;
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("cowtip");

        int n = io.nextInt();
        cows = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String cow = io.next();
            for (int j = 0; j < n; j++) {
                if (cow.charAt(j) == '1') {
                    cows[i][j] = true;
                }
            }
        }

        int output = 0;
        for (int i = n-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (cows[i][j]) {
                    cow_flipper(i, j);
                    output ++;
                }
            }
        }
        
        io.println(output);

        io.close();
    }
    static void cow_flipper(int r, int c) {
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                cows[i][j] = !cows[i][j];
            }
        }
    }
}
