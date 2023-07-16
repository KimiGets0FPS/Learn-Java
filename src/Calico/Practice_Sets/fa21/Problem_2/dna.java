package Calico.Practice_Sets.fa21.Problem_2;

import java.io.*;
import java.util.*;

class Kattio extends PrintWriter {
    private final BufferedReader r;
    private StringTokenizer st;
    public Kattio(InputStream i, OutputStream o) {
        super(o);
        r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(String problemName) throws IOException {
        super(new FileWriter(problemName + ".out"));
        r = new BufferedReader(new FileReader(problemName + ".in"));
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

public class dna {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);
        
        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(solution(io.next()));
        }
        
        io.close();
    }

    public static String solution(String original) {
        char[] dna = original.toCharArray();
        StringBuilder new_dna = new StringBuilder();
        for (char c : dna) {
            if (c == 'A') {
                new_dna.append("T");
            }
            else if (c == 'T') {
                new_dna.append("A");
            }
            else if (c == 'G') {
                new_dna.append("C");
            }
            else {
                new_dna.append("G");
            }
        }
        return new_dna.toString();
    }
}
