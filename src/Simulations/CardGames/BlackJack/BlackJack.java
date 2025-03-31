package Simulations.CardGames.BlackJack;

import Simulations.CardGames.Resources.Kattio;

import java.io.*;
import java.util.*;

import static Simulations.CardGames.Resources.ShuffleDeck.shuffle_deck;

public class BlackJack {
    static Kattio io = new Kattio(System.in, System.out);
    public static void main(String[] args) throws IOException {
        ArrayList<String> shuffled = shuffle_deck();
        game(shuffled);
        System.out.print("Do you still want to play (y or n): ");
        if (io.next().equals("y")) {
            main(args);
        }
    }
    public static void game(ArrayList<String> cards) {
        int current = 0;
        while (current < cards.size()) {
            ArrayList<String> hand = new ArrayList<>();
            hand.add(cards.get(current));
            hand.add(cards.get(current + 1));


            current ++;
        }
    }
    public static int get_sum(ArrayList<String> hand) {
        int sum = 0;
        for (int i=0; i < hand.size(); i++) {
            
        }
        return sum;
    }
}

