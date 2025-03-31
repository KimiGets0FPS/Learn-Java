package USACO.S24.Dec.Problem_3;

import java.util.*;
import java.io.*;

public class Problem_3 {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.nextInt();
        int q = io.nextInt();

        List<int[]> Q = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int r = io.nextInt();
            int c = io.nextInt();
            char t = io.next().charAt(0);

            Q.add(new int[] { r, c, t });
        }

        List<Integer> res = solution(n, Q);

        for (int i : res) {
            io.println(i);
        }

        io.close();
    }

    public static List<Integer> solution(int N, List<int[]> Q) {
        List<Integer> out = new ArrayList<>();
        char[][] matrix = new char[N][N];
        for (int[] q : Q) {
            int row = q[0] - 1;
            int col = q[1] - 1;
            char ch = (char) q[2]; // L, R, U, D

            out.add(cal(matrix, row, col, ch, N));
        }
        return out;
    }

    static int cal(char[][] matrix, int row, int col, char ch, int N) {
        int count = 0;
        matrix[row][col] = ch;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visit(matrix, i, j, new boolean[N][N], N) > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    static int visit(char[][] matrix, int row, int col, boolean[][] visited, int N) {
        if (row < 0 || col < 0 || row == N || col == N) {
            return 0;
        }

        if (visited[row][col])
            return 1;

        visited[row][col] = true;

        char ch = matrix[row][col];
        if (ch == 'L') {
            int res = visit(matrix, row, col - 1, visited, N);
            if (res == 0)
                return res;
            return res + 1;
        }

        else if (ch == 'R') {
            int res = visit(matrix, row, col + 1, visited, N);
            if (res == 0)
                return res;
            return res + 1;
        }

        else if (ch == 'U') {
            int res = visit(matrix, row - 1, col, visited, N);
            if (res == 0)
                return res;
            return res + 1;
        }

        else if (ch == 'D') {
            int res = visit(matrix, row + 1, col, visited, N);
            if (res == 0)
                return res;
            return res + 1;
        }

        else {
            matrix[row][col] = 'L';
            int res = visit(matrix, row, col - 1, visited, N);
            if (res == 0) {
                matrix[row][col] = '?';
                return 0;
            }

            matrix[row][col] = 'R';
            res = visit(matrix, row, col + 1, visited, N);

            if (res == 0) {
                matrix[row][col] = '?';
                return 0;
            }

            matrix[row][col] = 'U';
            res = visit(matrix, row - 1, col, visited, N);
            if (res == 0) {
                matrix[row][col] = '?';
                return 0;
            }

            matrix[row][col] = 'D';
            res = visit(matrix, row + 1, col, visited, N);
            if (res == 0) {
                matrix[row][col] = '?';
                return 0;
            }

            return res + 1;
        }
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
