package USACO.B24.Dec.Problem_3;

import java.util.*;
import java.io.*;

public class Problem_3 {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.nextInt();
        int f = io.nextInt();
        String str = io.next();

        Set<String> output = cal(str, f);
        io.println(output.size());
        for (String s : output) {
            io.println(s);
        }

        io.close();
    }

    public static Set<String> cal(String str, int threshold) {
        Map<String, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);

            List<Integer> list = indexMap.getOrDefault(sub, new ArrayList<>());
            list.add(i);
            indexMap.put(sub, list);
        }

        Set<String> out = new TreeSet<>();
        for (Map.Entry<String, List<Integer>> entry : indexMap.entrySet()) {

            if (isMoo(entry.getKey().toCharArray()) && entry.getValue().size() >= threshold) {
                out.add(entry.getKey());
            }

            for (int i = 0; i < 3; i++) {
                char[] copy = entry.getKey().toCharArray();
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if (copy[i] != ch) {
                        copy[i] = ch;
                        if (isMoo(copy)) {
                            String strMoo = String.valueOf(copy);
                            List<Integer> originalIdx = entry.getValue();
                            List<Integer> afterIdx = indexMap.getOrDefault(strMoo, new ArrayList<>());

                            if ((afterIdx.size() + 1 >= threshold) && isIndexOK(originalIdx, afterIdx)) {
                                out.add(strMoo);
                            }
                        }
                    }
                }
            }
        }
        return out;
    }

    private static boolean isIndexOK(List<Integer> originalIdx, List<Integer> afterIdx) {
        boolean ok = false;
        for (int idx : originalIdx) {
            boolean f = true;
            for (int idx2 : afterIdx) {
                if (Math.abs(idx - idx2) < 3) {
                    f = false;
                    break;
                }
            }
            if (f) {
                ok = true;
                break;
            }
        }
        return ok;
    }

    private static boolean isMoo(char[] moo) {
        return moo[1] == moo[2] && moo[0] != moo[1];
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
