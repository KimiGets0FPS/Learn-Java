package Simulations.CardGames.Resources;

import java.util.*;


public class ShuffleDeck {
    public static ArrayList<String> shuffle_deck() {
        String[] suits = {"♣", "♦", "♥", "♠"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        ArrayList<String> cards = new ArrayList<>();
        for (String rank : ranks) {
            for (String suit : suits) {
                cards.add(suit + rank);
            }
        }
        Collections.shuffle(cards);
        return cards;
    }
}
