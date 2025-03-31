package AdventOfCode.Y2024.DayTwo;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Kattio extends PrintWriter {
    private final BufferedReader r;
    private StringTokenizer st;
    private String token;

    public Kattio() {
        this(System.in, System.out);
    }

    public Kattio(InputStream i, OutputStream o) {
        super(o);
        r = new BufferedReader(new InputStreamReader(i));
    }

    public Kattio(String problemName) throws IOException {
        super(new FileWriter(problemName + ".out"));
        r = new BufferedReader(new FileReader(problemName + ".in"));
    }

    public boolean hasMoreTokens() {
        return peekToken() != null;
    }

    private String peekToken() {
        if (token == null)
            try {
                while (st == null || !st.hasMoreTokens()) {
                    String line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException _) {
            }
        return token;
    }

    public String next() {
        try {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(r.readLine());
            return st.nextToken();
        } catch (Exception ignored) {
        }
        return null;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
}


public class DayTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\zhewe\\Documents\\Coding Projects\\Learn-Java\\src\\AdventOfCode\\Y2024\\DayTwo\\reports.in")));
        PrintWriter pw = new PrintWriter(new FileOutputStream("C:\\Users\\zhewe\\Documents\\Coding Projects\\Learn-Java\\src\\AdventOfCode\\Y2024\\DayTwo\\reports.out"));

        ArrayList<ArrayList<Integer>> reports = new ArrayList<>();
        for (int i=0; i < 1000; i++) {
            StringTokenizer st = new StringTokenizer(r.readLine());
            ArrayList<Integer> report = new ArrayList<>();
            while (st.hasMoreTokens()) {
                report.add(Integer.parseInt(st.nextToken()));
            }
            reports.add(report);
        }
        pw.println("Part 1: " + part_1(reports));
        pw.println("Part 2: " + part_2(reports));

        pw.close();
    }

    public static int part_1(ArrayList<ArrayList<Integer>> reports) {

        boolean[] increasing = new boolean[reports.size()];
        for (int i=0; i < reports.size(); i++) {
            increasing[i] = reports.get(i).getFirst() < reports.get(i).getLast();
        }

        int safe = 0;

        for (int i=0; i < reports.size(); i++) {
            if (processing(reports.get(i), increasing[i])) {
                safe++;
            }
        }

        return safe;
    }

    public static boolean processing(ArrayList<Integer> report, boolean increasing) {
        for (int j=0; j < report.size()-1; j++) {
            int current = report.get(j), next = report.get(j + 1);
            if (increasing) {
                if (current > next) {
                    return false;
                }
                if (next - current < 1 || next - current > 3) {
                    return false;
                }
            }
            else {
                if (current < next) {
                    return false;
                }
                if (current - next < 1 || current - next > 3) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int part_2(ArrayList<ArrayList<Integer>> reports) {
        boolean[] increasing = new boolean[reports.size()];
        for (int i=0; i < reports.size(); i++) {
            increasing[i] = reports.get(i).getFirst() < reports.get(i).getLast();
        }

        int safe = 0;

        for (int i=0; i < reports.size(); i++) {
            if (processing(reports.get(i), increasing[i])) {
                safe++;
            }
            else {
                ArrayList<Integer> temp = new ArrayList<>(reports.get(i));
                for (int j=0; j < reports.get(i).size(); j++) {
                    int val = temp.remove(j);

                    System.out.println(temp);

                    if (processing(temp, increasing[i])) {
                        safe++;
                    }
                    temp.add(j, val);
                }
            }
        }
        return safe;
    }
}
