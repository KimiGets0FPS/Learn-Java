package USACO.B19.Dec.Problem_3;

import java.util.*;
import java.io.*;

public class Livestock_Lineup {
    static class Pair<A, B> {
        A first;
        B second;
        public Pair(A fval, B sval) {
            first = fval;
            second = sval;
        }
    }

    static int get_id(String cow) {
        return switch (cow) {
            case "Beatrice" -> 0;
            case "Belinda" -> 1;
            case "Bella" -> 2;
            case "Bessie" -> 3;
            case "Betsy" -> 4;
            case "Blue" -> 5;
            case "Buttercup" -> 6;
            default -> 7;
        };
    }

    static String get_cow(int id) {
        return switch (id) {
            case 0 -> "Beatrice";
            case 1 -> "Belinda";
            case 2 -> "Bella";
            case 3 -> "Bessie";
            case 4 -> "Betsy";
            case 5 -> "Blue";
            case 6 -> "Buttercup";
            default -> "Sue";
        };
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\B19\\Dec\\Problem_3\\lineup.in"));
        PrintWriter pw = new PrintWriter("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\B19\\Dec\\Problem_3\\lineup.out");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        ArrayList<Pair<Integer, Integer>> req = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            String y = null;
            for (int j = 0; j < 5; j++) {
                y = st.nextToken();
            }
            req.add(new Pair<>(get_id(x), get_id(y)));
        }

        System.out.println(req);

        pw.close();
    }
    
}
