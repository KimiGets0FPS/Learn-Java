package Calico.Competition.Problem_1;

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


public class bookshelf {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);
        
        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            int n = io.nextInt();
            int b = io.nextInt();
            int w = io.nextInt();
            int d = io.nextInt();
            int[] h = new int[n];
            for (int j = 0; j < n; j++) {
                h[j] = io.nextInt();
            }
            System.out.println(solution(b, w, d, h));
        }
        
        io.close();
    }

    public static int solution(int b, int w, int d, int[] h) {
        int total_volume = 0;

        total_volume += (b*b*d) * 4; // 4 corners
        total_volume += (w*b*d)*2;  // Top and Bottom without corners
        for (int l : h) {
            total_volume += (l * b * d) * 2;
        }
        total_volume += (((2 * b) + w) * b * d) * (h.length - 1); // volume for shelves + side
        return total_volume;
    }
}
