package USACO.B16.Jan.Problem_2;

import java.util.*;
import java.io.*;

import static java.lang.Math.max;

public class Angry_Cows {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kiddy\\Desktop\\java stuff\\src\\USACO\\B16\\Jan\\Problem_2\\angry.in"));
        PrintWriter pw = new PrintWriter("C:\\Users\\kiddy\\Desktop\\java stuff\\src\\USACO\\B16\\Jan\\Problem_2\\angry.out");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Set<Integer> c = new TreeSet<>();  // Already sorted!!!
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            c.add(Integer.parseInt(st.nextToken()));
        }
        br.close();
        Object[] cows = c.toArray();
        int max_exp = -1;
        for (int i = 0; i < cows.length; i++) {
            int current = -1;
//            Go two directions
            for (int j = i; j < cows.length; j++) {
                
            }
            for (int j = i; j < cows.length; j++) {

            }
            max_exp = max(current, max_exp);
        }
        pw.close();
    }
}
