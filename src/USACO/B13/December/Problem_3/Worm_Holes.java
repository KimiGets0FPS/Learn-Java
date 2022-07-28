package USACO.B13.December.Problem_3;

import java.io.*;
import java.util.*;

public class Worm_Holes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String[][] cows = new String[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                cows[i][j] = st.nextToken();
            }
        }
        pw.println(Arrays.deepToString(cows));
//        pw.println(wormholes(n, cows));
        pw.close();
    }
//    public static int wormholes(int n, String[][] cows) {
//        int hours = 0;
//
//    }
}
