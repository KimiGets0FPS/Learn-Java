package USACO.B20.Jan.Problem_3;

import java.io.*;
import java.util.*;

class Kattio extends PrintWriter {
	private BufferedReader r;
	private StringTokenizer st;
	// standard input
	public Kattio() {
	    this(System.in,System.out);
    }
	public Kattio(InputStream i, OutputStream o) {
		super(o);
		r = new BufferedReader(new InputStreamReader(i));
	}

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
        catch (Exception e) {}
		return null;
	}
	public int nextInt() { return Integer.parseInt(next()); }
	public double nextDouble() { return Double.parseDouble(next()); }
	public long nextLong() { return Long.parseLong(next()); }
}


public class Race {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("race");

        int k = io.nextInt();
        int n = io.nextInt();

        while (n-->0) {
            int x = io.nextInt();
			while (k-->0) {
				
			}
        }

        io.close();
    }
}
