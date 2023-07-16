package USACO.B21.Jan.Problem_2;

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
		} catch (Exception e) {}
		return null;
	}
	public int nextInt() { return Integer.parseInt(next()); }
	public double nextDouble() { return Double.parseDouble(next()); }
	public long nextLong() { return Long.parseLong(next()); }
}


public class Even_More_Odd_Photos {
    public static void main(String[] args) throws IOException {
		Kattio io = new Kattio(System.in, System.out);

		int odd_count = 0, even_count = 0;

		int n = io.nextInt();
		int[] ids = new int[n];
		for (int i = 0; i < n; i++) {
			ids[i] = io.nextInt();
			if (ids[i] % 2 == 0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		}

		while (odd_count > even_count) {
			odd_count -= 2;
			even_count++;
		}
		if (even_count > odd_count + 1) {
			even_count = odd_count + 1;
		}

		io.println(even_count + odd_count);

        io.close();
    }
}
