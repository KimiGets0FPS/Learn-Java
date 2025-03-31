package USACO.B24.Dec.Problem_2;

import java.io.*;
import java.util.*;

public class Problem_2 {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.nextInt();
        int q = io.nextInt();

        boolean[][][] coords = new boolean[n][n][n];
        int[][] rowCount = new int[n][n];
        int[][] colCount = new int[n][n];
        int[][] depthCount = new int[n][n];

        boolean[][] rowFull = new boolean[n][n];
        boolean[][] colFull = new boolean[n][n];
        boolean[][] depthFull = new boolean[n][n];

        int count = 0;

        for (int i = 0; i < q; i++) {
            int x = io.nextInt();
            int y = io.nextInt();
            int z = io.nextInt();

            if (!coords[x][y][z]) {
                coords[x][y][z] = true;

                rowCount[y][z]++;
                colCount[x][z]++;
                depthCount[x][y]++;

                if (rowCount[y][z] == n && !rowFull[y][z]) {
                    count++;
                    rowFull[y][z] = true;
                }

                if (colCount[x][z] == n && !colFull[x][z]) {
                    count++;
                    colFull[x][z] = true;
                }

                if (depthCount[x][y] == n && !depthFull[x][y]) {
                    count++;
                    depthFull[x][y] = true;
                }
            }
            io.println(count);
        }
        io.close();
    }
}

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