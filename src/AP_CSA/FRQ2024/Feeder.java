package AP_CSA.FRQ2024;

public class Feeder {
    private int currentFood;

    public Feeder(int initialFood) {
        currentFood = initialFood;
    }

    public void simulateOneDay(int numBirds) {
        int initial_condition = (int) (Math.random() * 100 + 1);
        if (initial_condition <= 5) {
            currentFood = 0;
        }
        else {
            int foodPerBird = (int) (Math.random() * 40 + 10);
            currentFood -= numBirds * foodPerBird;
            if (currentFood < 0) {
                currentFood = 0;
            }
        }
    }

    public int simulateManyDays(int numBirds, int numDays) {
        int output = 1;
        for (int i=0; i < numDays; i++) {
            if (currentFood == 0) {
                break;
            }
            simulateOneDay(numBirds);
            output ++;
        }
        return output;
    }
}
