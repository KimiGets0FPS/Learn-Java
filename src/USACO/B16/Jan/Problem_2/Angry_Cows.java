package USACO.B16.Jan.Problem_2;

import java.util.*;
import java.io.*;

public class Angry_Cows {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\B16\\Jan\\Problem_2\\angry.in"));
        PrintWriter pw = new PrintWriter("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\B16\\Jan\\Problem_2\\angry.out");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Set<Integer> c = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            c.add(Integer.parseInt(st.nextToken()));
        }

        int[] bales = new int[n];
        int e = 0;
        for (int cow: c) {
            bales[e] = cow;
            e += 1;
        }

        int output = -1;
        for (int i=1; i < bales.length; i++) {
            output = Math.max(output, exploded_count(i, 1, bales) + exploded_count(i, -1, bales) + 1);
        }

        pw.println(output);

        pw.close();
    }

    public static int exploded_count(int start, int direction, int[] bales) {
        int radius = 1;
        int previous = start;
        while (true) {
            int next = previous;
            while (next + direction >= 0 && next + direction < bales.length && Math.abs(bales[next + direction] - bales[previous]) <= radius) {
                next += direction;
            }
            if (next == previous) {
                break;
            }
            radius++;
            previous = next;
        }
        return Math.abs(previous-start);
    }
}
