package USACO.B18.December.Problem_3;

import java.io.*;
import java.util.*;

public class Back_and_Forth {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
        PrintWriter pw = new PrintWriter("backforth.out");
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> b1 = new ArrayList<>();
        List<Integer> b2 = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            b1.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i < 10; i++) {
            b2.add(Integer.parseInt(st.nextToken()));
        }
        pw.println(backforth(b1, b2));
        pw.close();
    }

    public static int backforth(List<Integer> b1, List<Integer> b2) {
        Set<Integer> output = new HashSet<>();
        bt(b1, b2, 1000, output, 2);
        return output.size();
    }

    static void bt(List<Integer> b1, List<Integer> b2, int current, Set<Integer> output, int day) {
        if (day == 6) {
            output.add(current);
        }

        else {
            if (day % 2 == 0) {
                for (int i=0; i<b1.size(); i++) {
                    int bsize = b1.get(i);
                    current -= bsize;
                    b2.add(bsize);
                    b1.remove(i);
                    bt(b1, b2, current, output, day+1);
                    current += bsize;
                    b1.add(i, bsize);
                    b2.remove(b2.size()-1);
                }
            }
            else {
                for (int i=0; i<b2.size(); i++) {
                    int bsize = b2.get(i);
                    current += bsize;
                    b1.add(bsize);
                    b2.remove(i);
                    bt(b1, b2, current, output, day+1);
                    current -= bsize;
                    b2.add(i, bsize);
                    b1.remove(b1.size()-1);
                }
            }
        }
    }
}
