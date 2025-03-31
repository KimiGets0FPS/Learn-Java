package AP_CSA;

public class Board {

    private String[][] squares = new String[10][10];

    public Board() {
        for (int i=0; i < squares.length; i++) {
            for (int j=0; j < squares[i].length; j++) {
                squares[i][j] = "-";
            }
        }
    }

    public String toString() {
        String output = "";
        for (int i=0; i < squares.length; i++) {
            for (int j=0; j < squares.length; j++) {
                output += squares[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }

    public boolean addShip(int row, int col, int len, boolean horizontal) {
        if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length) {
            return false;
        }
        if (horizontal) {
            if (col+len > squares.length) {
                return false;
            }
            for (int i=0; i < len; i++) {
                if (!squares[row][col+i].equals("-")) {
                    return false;
                }
            }
            for (int i=0; i < len; i++) {
                squares[row][col+i] = "b";
            }
        }

        else {
            if (row+len > squares.length) {
                return false;
            }
            for (int i=0; i < len; i++) {
                if (!squares[row+i][col].equals("-")) {
                    return false;
                }
            }
            for (int i=0; i < len; i++) {
                squares[row+i][col] = "b";
            }
        }

        return true;
    }

    public boolean foundShip(int len) {
        for (int i=0; i < squares.length; i++) {
            int count = 0;
            while (count < squares[0].length) {
                int found = 0;
                while (count < squares[0].length && squares[i][count].equals("b")) {
                    found ++;
                    count ++;
                }
                if (found == len) {
                    return true;
                }
                count ++;
            }
        }

        for (int i=0; i < squares[0].length; i++) {
            int count = 0;
            while (count < squares.length) {
                int found = 0;
                while (count < squares.length && squares[count][i].equals("b")) {
                    found ++;
                    count ++;
                }
                if (found == len) {
                    return true;
                }
                count ++;
            }
        }

        return false;
    }

    public int shoot(int row, int col) {
        if ((row < 0 || row >= squares.length) || (col < 0 || col >= squares[0].length)) {
            return -1;
        }

        if (squares[row][col].equals("-")) {
            squares[row][col] = "m";
            return 0;
        }

        if (squares[row][col].equals("b")) {
            squares[row][col] = "x";
            return 1;
        }
        return 2;
    }

    public boolean gameOver() {
        for (int i=0; i < squares.length; i++) {
            for (int j=0; j < squares[i].length; j++) {
                if (squares[i][j].equals("b")) {
                    return false;
                }
            }
        }
        return true;
    }

}
