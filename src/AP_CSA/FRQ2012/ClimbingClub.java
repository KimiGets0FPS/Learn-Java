package AP_CSA.FRQ2012;

import java.util.ArrayList;

public class ClimbingClub {
    private static ArrayList<ClimbInfo> climbList;

    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    public static void addClimb(String peakName, int climbTime) {
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    public int distinctPeakNames() {
        return 0;
    }
}
