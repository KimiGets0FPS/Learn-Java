package Calico.Competition.Problem_4;

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

public class bottles {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            int n = io.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = io.nextInt();
            }
            int[] result = solution(a);
            System.out.println(result[0]);
            for (int j = 0; j < n; j++) {
                System.out.print(result[j+1] + " ");
            }
            System.out.println("");
        }

        io.close();
    }
    public static int[] solution(int[] time) {
        int[][] nt = new int[time.length][2];
        for (int i = 0; i < time.length; i++) {
            nt[i][0] = time[i];
            nt[i][1] = i;
        }
        Arrays.sort(nt, Comparator.comparingInt(a -> a[0]));

        int[] output = new int[time.length + 1];
        int time_required = 0;
        int acc = 0;

        for (int[] ints : nt) {
            time_required += acc + ints[0];
            acc += ints[0];
        }
        output[0] = time_required;

        for (int i = 0; i < nt.length; i++) {
            output[i+1] = nt[i][1] + 1;
        }

        return output;
    }
}
