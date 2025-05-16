package AP_CSA.FRQ2024;

public class GridPath {
    private int[][] grid;

    public GridPath(int[][] grid) {
        this.grid = grid;
    }

    public Location getNextLoc(int row, int col) {
        if (row < grid.length - 1 && col == grid[0].length - 1) {
            return new Location(row + 1, col);
        }
        else if (row == grid.length - 1 && col < grid[0].length - 1) {
            return new Location(row, col + 1);
        }
        if (grid[row + 1][col] > grid[row][col + 1]) {
            return new Location(row + 1, col);
        }
        else if (grid[row + 1][col] < grid[row][col + 1]) {
            return new Location(row, col + 1);
        }
        return null;
    }

    public int sumPath(int row, int col) {
        int output = 0;
        while (row < grid.length-1 || col < grid[0].length - 1) {
            Location nextLocation = getNextLoc(row, col);
            output += grid[nextLocation.getRow()][nextLocation.getCol()];
        }
        return output;
    }
}
