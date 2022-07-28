package USACO.B20.December.Problem_3;

import java.util.*;
import java.io.*;

public class Stuck_in_Rut {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        List<int[]> north = new ArrayList<>();
        List<int[]> east = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (Objects.equals(direction, "N")) {
                north.add(new int[]{x, y, i});
            }
            else {
                east.add(new int[]{x, y, i});
            }
        }
        north.sort(Comparator.comparingInt(o->o[0]));
        east.sort(Comparator.comparingInt(o->o[1]));
        int[] locations = new int[n];
        Arrays.fill(locations, -1);
        for (int[] ncow : north) {
            for (int[] ecow : east) {
                if (ncow[0] > ecow[0] && ncow[1] < ecow[1]) {
                    int ndistance = ecow[1] - ncow[1];
                    int edistance = ncow[0] - ecow[0];

                    if (ndistance < edistance && locations[ecow[2]] == -1) {
                        locations[ecow[2]] = ncow[0];
                    }

                    if (ndistance > edistance && locations[ecow[2]] == -1) {
                        locations[ncow[2]] = ecow[1];
                        break;
                    }
                }
            }
        }
        int[] output = new int[n];
        Arrays.fill(output, -1);
        for (int[] ncow : north) {
            if (locations[ncow[2]] != -1) {
                output[ncow[2]] = locations[ncow[2]] - ncow[1];
            }
        }

        for (int[] ecow : east) {
            if (locations[ecow[2]] != -1) {
                output[ecow[2]] = locations[ecow[2]] - ecow[0];
            }
        }

        for (int j : output) {
            if (j == -1) {
                pw.println("Infinity");
            }
            else {
                pw.println(j);
            }
        }
        pw.close();
    }
}
