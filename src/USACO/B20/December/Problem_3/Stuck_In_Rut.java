package USACO.B20.December.Problem_3;

import java.util.*;
import java.io.*;

public class Stuck_In_Rut {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<int[]> ncows = new ArrayList<>();
        List<int[]> ecows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (direction.equals("N")) {
                ncows.add(new int[]{x, y, i});
            } else {
                ecows.add(new int[]{x, y, i});
            }
        }
        ncows.sort(Comparator.comparingInt(o -> o[0]));
        ecows.sort(Comparator.comparingInt(o -> o[1]));

        pw.close();
    }
}
