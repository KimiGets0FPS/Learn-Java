package USACO.B19.Feb.Problem_1;

import java.util.*;
import java.io.*;

public class Sleepy_Cow_Herding {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("herding.in"));
        PrintWriter pw = new PrintWriter("herding.out");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cows = new int[3];
        for (int i = 0; i < 3; i++) {
            cows[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cows);

        if (cows[2] - cows[0] == 2) {  // if the cows are already in order
            pw.println(0);
        }
        else if (cows[1] - cows[0] == 2 || cows[2] - cows[1] == 2) {
            pw.println(1);
        }
        else {
            pw.println(2);
        }

        pw.println(Math.max(cows[1] - cows[0] - 1, cows[2] - cows[1] - 1));

        pw.close();
    }
}
