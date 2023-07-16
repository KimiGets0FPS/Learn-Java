package Codeforces.WayTooLongWords;


import java.io.*;
import java.util.*;


public class WayTooLongWords {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int num = io.nextInt();
        for (int i = 0; i < num; i++) {
            String word = io.next();
            System.out.println(solution(word));
        }
    }
    public static String solution(String word) {
        ArrayList<String> letters = new ArrayList<>(List.of(word.split("")));

        if (letters.size() <= 10) {
            return word;
        }

        return letters.get(0) + (letters.size() - 2) + letters.get(letters.size() - 1);
    }
}


class Kattio extends PrintWriter {
    private final BufferedReader r;
    private StringTokenizer st;

    public Kattio() {
        this(System.in, System.out);
    }
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

