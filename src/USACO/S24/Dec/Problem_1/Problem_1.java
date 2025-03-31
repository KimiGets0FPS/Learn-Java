import java.util.*;
import java.io.*;

public class Problem_1 {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            int n = io.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = io.nextInt();
            }
            int[] out = cal(nums);
            io.println(out[0] + " " + out[1]);
        }

        io.close();
    }

    public static int[] cal(int[] arr) {
        int[] out = new int[2];

        int n = arr.length / 2 - 1;
        int sum = 0;
        int max;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        max = sum;

        for (int i = 0; i < n; i++) {
            int idxToMinus = n - i - 1;
            int idxToPlus = arr.length - 1 - i;

            sum = sum - arr[idxToMinus] + arr[idxToPlus];
            max = Math.max(max, sum);
        }

        sum = 0;
        for (int i : arr) {
            sum += i;
        }

        out[0] = sum - max;
        out[1] = max;

        return out;
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
