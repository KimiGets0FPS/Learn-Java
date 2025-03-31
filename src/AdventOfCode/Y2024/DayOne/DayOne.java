package AdventOfCode.Y2024.DayOne;
import java.io.*;
import java.util.*;


class Kattio extends PrintWriter {
    public Kattio(String fileName) throws IOException {
        super(new BufferedOutputStream(new FileOutputStream(fileName + ".out")));
        r = new BufferedReader(new InputStreamReader(new FileInputStream(fileName + ".in")));
    }

    public boolean hasMoreTokens() {
        return peekToken() != null;
    }

    public int nextInt() {
        return Integer.parseInt(nextToken());
    }

    public double nextDouble() {
        return Double.parseDouble(nextToken());
    }

    public long nextLong() {
        return Long.parseLong(nextToken());
    }

    public String nextWord() {
        return nextToken();
    }


    private final BufferedReader r;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null)
            try {
                while (st == null || !st.hasMoreTokens()) {
                    String line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException _) { }
        return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}

public class DayOne {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("historian");

        int[] left = new int[1000], right  = new int[1000];
        int i = 0;
        int n, m;
        while (io.hasMoreTokens()) {
            n = io.nextInt();
            m = io.nextInt();

            left[i] = n;
            right[i] = m;
            i++;
        }

        sort(left);
        sort(right);

        io.println("Part 1 Answer: " + part_1(left, right));

        io.println("Part 2 Answer: " + part_2(left, right));

        io.close();
    }

    public static int part_1(int[] left, int[] right) {
        int distances = 0;
        for (int i = 0; i < left.length; i++) {
            distances += Math.abs(Math.abs(left[i]) - Math.abs(right[i]));
        }
        return distances;
    }

    public static int part_2(int[] left, int[] right) {
        HashMap<Integer, Integer> left_count = new HashMap<>();
        for (int j : left) {
            left_count.put(j, left_count.getOrDefault(j, 0) + 1);
        }

        int output = 0;

        for (Integer l : left_count.keySet()) {
            int count = 0;
            for (int r : right) {
                if (l == r) {
                    count++;
                } else if (l < r) {
                    break;
                }
            }
            output += count * left_count.get(l) * l;
        }

        return output;
    }

    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }
}
