package USACO.B18.Open.Problem_1;

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;


public class Team_Tic_Tac_Toe {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\B18\\Open\\Problem_1\\tttt.in"));
        PrintWriter pw = new PrintWriter("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\B18\\Open\\Problem_1\\tttt.out");
        String[][] ttt = new String[3][3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] cow = st.nextToken().split("");
            System.arraycopy(cow, 0, ttt[i], 0, cow.length);
        }
        int single_victory = 0;
        int team_victory = 0;

        List<List<String>> has_won = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            List<String> tb = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                if (!tb.contains(ttt[i][j])) {
                    tb.add(ttt[i][j]);
                }
            }
            List<String> sorted = tb.stream().sorted().collect(Collectors.toList());
            if (!has_won.contains(sorted)) {
                if (tb.size() == 2) {
                    team_victory++;
                    has_won.add(sorted);
                }
                if (tb.size() == 1) {
                    single_victory++;
                    has_won.add(sorted);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            List<String> lr = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                if (!lr.contains(ttt[j][i])) {
                    lr.add(ttt[j][i]);
                }
            }
            List<String> sorted = lr.stream().sorted().collect(Collectors.toList());
            if (!has_won.contains(sorted)) {
                if (sorted.size() == 2) {
                    team_victory++;
                    has_won.add(sorted);
                }
                if (sorted.size() == 1) {
                    single_victory++;
                    has_won.add(sorted);
                }
            }
        }
        List<String> tl_br = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (!tl_br.contains(ttt[i][i])) {
                tl_br.add(ttt[i][i]);
            }
        }
        List<String> sorted = tl_br.stream().sorted().collect(Collectors.toList());
        if (!has_won.contains(sorted)) {
            if (sorted.size() == 2) {
                team_victory++;
                has_won.add(sorted);
            }
            if (sorted.size() == 1) {
                single_victory++;
                has_won.add(sorted);
            }
        }

        List<String> bl_tr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                if (!bl_tr.contains(ttt[i][j])) {
                    bl_tr.add(ttt[i][j]);
                }
            }
        }
        sorted = bl_tr.stream().sorted().collect(Collectors.toList());
        if (!has_won.contains(sorted)) {
            if (sorted.size() == 2) {
                team_victory++;
                has_won.add(sorted);
            }
            if (sorted.size() == 1) {
                single_victory++;
                has_won.add(sorted);
            }
        }

        pw.println(single_victory);
        pw.println(team_victory);
        pw.close();
    }
}