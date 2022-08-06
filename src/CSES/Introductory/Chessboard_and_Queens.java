package CSES.Introductory;

import java.util.*;
import java.io.*;

public class Chessboard_and_Queens {
    static int output = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int[][] board = new int[8][8];
        for (int i = 0; i < 8; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] line = st.nextToken().split("");
            for (int j = 0; j < 8; j++) {
                if (Objects.equals(line[j], ".")) {
                    board[i][j] = 0;
                }
                else {
                    board[i][j] = 1;
                }
            }
        }

        bt(board, 0, 0, 0);
        
        pw.println(output);
        
        pw.close();
    }

    public static void bt(int[][] board, int count, int ii, int jj) {
        if (count == 8) {
            output++;
        }
        else {

            for (int i = ii; i < board.length; i++) {
                for (int j = jj; j < board[i].length; j++) {
                    if (board[i][j] == 0) {
                        boolean flag = false;
//                    Looking Diagonally to the top left
                        for (int k=i, l=j; k >= 0 && l >= 0; k--, l--) {
                            if (board[k][l] == 2) {
                                flag = true;
                                break;
                            }
                        }
//                    Looking to the up
                        if (!flag) {
                            for (int k = i; k >= 0; k--) {
                                if (board[k][j] == 2) {
                                    flag = true;
                                    break;
                                }
                            }
                        }
//                    Looking left
                        if (!flag) {
                            for (int k = j; k >= 0; k--) {
                                if (board[i][k] == 2) {
                                    flag = true;
                                    break;
                                }
                            }
                        }
//                    looking diagonally to the top right
                        if (!flag) {
                            for (int k=i, l=j; k >=0 && l < 8; k--, l++) {
                                if (board[k][l] == 2) {
                                    flag = true;
                                    break;
                                }
                            }
                        }

                        if (!flag) {
                            board[i][j] = 2;
                            bt(board, count+1, i+1, 0);
                            board[i][j] = 0;
                        }
                    }
                }
            }
        }
    }
}
