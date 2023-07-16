package Calico.Practice_Sets.fa21.Problem_3;

import java.io.*;
import java.util.*;

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
}

public class library {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);
        
        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            String absent = io.next();
            int n = io.nextInt();
            String[] turned_in = new String[n];
            String[] owners = new String[n];
            for (int j = 0; j < n; j++) {
                turned_in[j] = io.next();
                io.next();
                io.next();
                String owner = io.next();
                owners[j] = owner.substring(0, owner.length()-2);
                io.next();
            }
            System.out.println(solution(absent, turned_in, owners));
        }
        
        io.close();
    }

    public static String solution(String absent, String[] turned_in, String[] owners) {
        ArrayList<String> people = new ArrayList<>();
        people.add(absent);
        people.addAll(List.of(turned_in));

        for (String owner : owners) {
            for (int j = 0; j < people.size(); j++) {
                if (owner.equals(people.get(j))) {
                    people.remove(j);
                    break;
                }
            }
        }

        return absent + " HAS " + people.get(0) + "'s BOOK";
    }
}
