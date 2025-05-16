package AP_CSA.FRQ2024;

public class Scoreboard {
    private String teamOne, teamTwo;
    private int oneScore, twoScore;
    private boolean oneActive;

    public Scoreboard(String nameOne, String nameTwo) {
        teamOne = nameOne;
        teamTwo = nameTwo;
        oneActive = true;
        oneScore = 0;
        twoScore = 0;
    }

    public void recordPlay(int points) {
        if (points == 0) {
            oneActive = !oneActive;
        }
        else {
            if (oneActive) {
                oneScore += points;
            }
            else {
                twoScore += points;
            }
        }
    }

    public String getScore() {
        String output = oneScore + "-" + twoScore;
        if (oneActive) {
            return output + teamOne;
        }
        return output + teamTwo;
    }
}
