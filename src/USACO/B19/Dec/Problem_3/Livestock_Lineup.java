package USACO.B19.Dec.Problem_3;

import java.io.*;
import java.util.*;

class Kattio extends PrintWriter {
    private final BufferedReader r;
    private StringTokenizer st;

    public Kattio(String problemName) throws IOException {
        super("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\B19\\Dec\\Problem_3\\" + problemName+".out");
        r = new BufferedReader(new FileReader("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\B19\\Dec\\Problem_3\\" + problemName+".in"));
    }

    public String next() {
        try {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(r.readLine());
            return st.nextToken();
        }
        catch (Exception ignored) {}
        return null;
    }
    public int nextInt() {
        return Integer.parseInt(next());
    }
}


public class Livestock_Lineup {
    static class Pair<A, B> {
        A first;
        B second;
        public Pair(A first_value, B second_value) {
            first = first_value;
            second = second_value;
        }

        public Object getKey() {
            return first;
        }
        public Object getValue() {
            return second;
        }
    }
    static List<Pair<String, String>> r = new ArrayList<>();
    static Map<String, List<String>> rules = new HashMap<>();
    static String[] cows = {"Beatrice", "Belinda", "Bella", "Bessie", "Betsy", "Blue", "Buttercup", "Sue"};

    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("lineup");
        
        int n = io.nextInt();

        for (int i = 0; i < n; i++) {
            String first_cow = io.next();
            for (int j = 0; j < 4; j++) {
                io.next();
            }
            String second_cow = io.next();
            Pair<String, String> rule;
            if (first_cow.compareTo(second_cow) > 0) {
                rule = new Pair<>(second_cow, first_cow);
            }
            else {
                rule = new Pair<>(first_cow, second_cow);
            }
            r.add(rule);
        }
        r.sort(Comparator.comparing(o -> o.first));

        for (Pair<String, String> rule : r) {
//            rules.put(rule.getKey(), rule.getValue());
            System.out.println(rule.getKey()+ ": " + rule.getValue());
        }

        for (int i = 0; i < r.size(); i++) {

        }
        // {"Beatrice", "Belinda", "Bella", "Bessie", "Betsy", "Blue", "Buttercup", "Sue"}

        for (int i = 0; i < r.size(); i++) {
            for (int j = 0; j < cows.length; j++) {
                
            }
        }
        
        io.close();
    }
}
