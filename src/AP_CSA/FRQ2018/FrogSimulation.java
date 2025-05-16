package AP_CSA.FRQ2018;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        /*
        implementation not shown
         */
        return 0;
    }

    public boolean simulate() {
        int distance = 0;
        for (int i=0; i < maxHops; i++) {
            distance += hopDistance();
            if (distance >= goalDistance) {
                return true;
            }
            if (distance < 0) {
                return false;
            }
        }
        return false;
    }

    public double runSimulation(int num) {
        double goal_reached = 0;
        for (int i=0; i < num; i++) {
            if (simulate()) {
                goal_reached ++;
            }
        }
        return goal_reached / (double) num;
    }
}
