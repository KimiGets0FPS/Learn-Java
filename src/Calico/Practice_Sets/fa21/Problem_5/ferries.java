package Calico.Practice_Sets.fa21.Problem_5;

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

public class ferries {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);
        
        int t = io.nextInt();

        for (int i = 0; i < t; i++) {
            int n = io.nextInt();
            float price = Float.parseFloat(io.next().substring(1));
            String starting = io.next();
            String destination = io.next();
            Map<String, String> road = new HashMap<>();
            List<String> dock = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                String type = io.next();
                String one = io.next();
                if (type.equals("ROAD")) {
                    road.put(one, io.next());
                }
                else {
                    dock.add(one);
                }
            }
            float result = backtracking(starting, starting, price, destination, road, dock);
            if (result > 0) {
                System.out.println("Bring " + result + " for the trip.");
            }
            if (result == 0) {
                System.out.println("The trip is free!");
            }
            else {
                System.out.println("Just stay home");
            }
        }
        
        io.close();
    }
    public static float backtracking(String current, String previous, float price, String destination, Map<String, String> road, List<String> dock) {
        if (current.equals(destination)) {
            return price;
        }
        for (Map.Entry<String,String> mapElement : road.entrySet()) {
            String key = mapElement.getKey();
            if (key.equals(current) || road.get(key).equals(current)) {
                
            }
        }
        return -1;  // Everything ends, and
    }
}
