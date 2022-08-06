package USACO.B16.Jan.Problem_1;

import java.util.*;
import java.io.*;


public class Promotion_Count {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("promote.in"));
        PrintWriter pw = new PrintWriter("promote.out");


        int[][] league = new int[4][2];
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                league[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] output = new int[3];  // bronze to silver, silver to gold, gold to platinum
        output[0] = league[1][1] - league[1][0] + league[2][1] - league[2][0] + league[3][1] - league[3][0];
        output[1] =  league[2][1] - league[2][0] + league[3][1] - league[3][0];
        output[2] = league[3][1] - league[3][0];

        for (int i : output) {
            pw.println(i);
        }

        pw.close();
    }
    
}
