package Calico.Practice_Sets.sp22.Problem_1;

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

public class decks {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            float n = io.nextInt();
            io.println(solution(n));
        }

        io.close();
    }

    public static int solution(float n) {
        return (int) Math.ceil(((n * ((3 * n) + 1)) / 2) / 54);
    }
}
