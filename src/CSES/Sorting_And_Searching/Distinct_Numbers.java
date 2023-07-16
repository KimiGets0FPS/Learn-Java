package CSES.Sorting_And_Searching;

import java.io.*;
import java.util.*;

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
}

public class Distinct_Numbers {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);
        int num = io.nextInt();
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < num; i++) {
            nums.add(io.nextInt());
        }
        io.println(nums.size());
        io.close();
    }
}
