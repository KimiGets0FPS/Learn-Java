package test;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[][][] e = new int[8][8][2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                e[i][j][1] = i;
                e[i][j][0] = j;
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.deepToString(e[i]));
        }
    }
}
