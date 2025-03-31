package USACO.B24.Dec.Problem_1;

import java.io.*;
import java.util.StringTokenizer;

public class Problem_1 {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int testCases = io.nextInt();

        for (int i = 0; i < testCases; i++) {
            int n = io.nextInt();
            io.println(solution(n));
        }

        io.close();
    }

    public static int solution(long n) {
        int output = 0;
        if (n < 45) {
            return output;
        }
        if (n < 49) {
            return (int) (output - 45 + 1 + n);
        }
        output += 5;

        if (n < 445) {
            return output;
        }
        if (n < 499) {
            return (int) (output - 445 + 1 + n);
        }
        output += 55;

        if (n < 4445) {
            return output;
        }
        if (n < 4999) {
            return (int) (output - 4445 + 1 + n);
        }
        output += 555;

        if (n < 44445)
            return output;
        if (n < 49999)
            return (int) (output - 44445 + 1 + n);
        output += 5555;

        if (n < 444445)
            return output;
        if (n < 499999)
            return (int) (output - 444445 + 1 + n);
        output += 55555;

        if (n < 4444445)
            return output;
        if (n < 4999999)
            return (int) (output - 4444445 + 1 + n);
        output += 555555;

        if (n < 44444445)
            return output;
        if (n < 49999999)
            return (int) (output - 44444445 + 1 + n);
        output += 5555555;

        if (n < 444444445)
            return output;
        if (n < 499999999)
            return (int) (output - 444444445 + 1 + n);
        output += 55555555;

        if (n < 4444444445L) {
            return output;
        }
    return (int) (output - 4444444445L + 1 + n);
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
        } catch (Exception ignored) {
        }
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
