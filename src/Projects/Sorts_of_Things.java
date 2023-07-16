package Projects;

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
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    public long nextLong() {
        return Long.parseLong(next());
    }
}

public class Sorts_of_Things {
    static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public int[] generate(int size) {
        int[] data_set = new int[size];
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            data_set[i] = random.nextInt(1000);
        }
        return data_set;
    }


    public boolean _sorted(int[] ds) {
        for (int i = 1; i < ds.length; i++) {
            if (ds[i] < ds[i-1]) {
                return false;
            }
        }
        return true;
    }

    long bogo_sort(int[] data_set) {
        List<int[]> list = new ArrayList<>();
        list.add(data_set);


        long startTime = System.currentTimeMillis();
        while (!(_sorted(data_set))) {
            Collections.shuffle(list);
        }
        long stopTime = System.currentTimeMillis();

        return stopTime - startTime;
    }

    long bubble_sort(int[] data_set) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < data_set.length; i++) {
            for (int j = i+1; j < data_set.length; j++) {
                if (data_set[j] < data_set[j-1]) {
                    int temp = data_set[j-1];
                    data_set[j-1] = data_set[j];
                    data_set[j] = temp;
                }
            }
        }

        if (!(_sorted(data_set))){
            return 0;
        }

        long stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }

    static void _merge_sort(int[] data_set) {

    }

    long merge_sort(int[] data_set) {
        long startTime= System.currentTimeMillis();

        long stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        io.println("e: ");
        io.next();

        clear();
        
        io.close();
    }
}
