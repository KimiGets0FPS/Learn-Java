package AP_CSA.FRQ2024;

import java.util.ArrayList;

public class WordChecker {
    private ArrayList<String> wordList;

    public boolean isWordChain() {
        for (int i=1; i < wordList.size(); i++) {
            if (!wordList.get(i).contains(wordList.get(i-1))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> createList(String target) {
        ArrayList<String> output = new ArrayList<>();
        for (int i=0; i < target.length(); i++) {
            if (wordList.get(i).substring(0, target.length()).equals(target)) {
                output.add(wordList.get(i));
            }
        }
        return output;
    }
}
