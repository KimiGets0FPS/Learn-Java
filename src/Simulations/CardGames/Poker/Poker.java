package Simulations.CardGames.Poker;


import Simulations.CardGames.Resources.Kattio;

import static Simulations.CardGames.Resources.ShuffleDeck.shuffle_deck;

import static Simulations.CardGames.Poker.Hand_Identifiers.*;

import java.io.*;
import java.util.*;

public class Poker {
    static Kattio io = new Kattio(System.in, System.out);
    public static String[] p1 = new String[2], p2 = new String[2], p3 = new String[2], player_cards = new String[2], community_cards = new String[5];

    public static void main(String[] args) throws IOException {
        recursive();
        System.out.println("Thanks for playing!");
    }

    public static Object recursive() {
        game();
        System.out.print("Do you still want to play (y or n): ");
        if (Objects.equals(io.next(), "n")) {
            return true;
        }
        return recursive();
    }

    public static void game() {
        int current = 0;
        ArrayList<String> shuffled = shuffle_deck();

        for (int i = 0; i < 4; i++) {  // 4 rounds
            split_cards(shuffled, current);  // 4 players
            current += 13;

            System.out.println("Your cards: " + player_cards[0] + ", " + player_cards[1]);
            System.out.print("Do you want to bet (y or n): ");
            if (io.next().equals("y")) {
                System.out.print("How much do you want to bet: ");
                io.println(io.nextInt());
            } else {
                System.out.println("You folded");
                continue;
            }

            print_cards();

            System.out.print("Next cards (enter exit to quit)...");
            if (io.next().equals("exit")) {
                return;
            }
            clear();
        }
    }

    private static void split_cards(ArrayList<String> shuffled, int current) {
        for (int i = 0; i < 2; i++) {  // 4 players
            p1[i] = shuffled.get(i + current);
            p2[i] = shuffled.get(i + current + 1);
            p3[i] = shuffled.get(i + current + 2);
            player_cards[i] = shuffled.get(i + current + 3);
            current += 3;
        }
        current += 2;
        for (int j = 0; j < 5; j++) {
            community_cards[j] = shuffled.get(current + j);
        }
    }

    private static void print_cards() {
        System.out.print("Bot 1's hand: "); identify_hand(p1, community_cards);
        System.out.print("Bot 2's hand: "); identify_hand(p2, community_cards);
        System.out.print("Bot 3's hand: "); identify_hand(p3, community_cards);
        System.out.print("Your hand: "); identify_hand(player_cards, community_cards);
        System.out.print("Do you want to view everyone's cards (y or n): ");
        if (io.next().equals("y")) {
            System.out.println("Player 1 cards: " + Arrays.toString(p1));
            System.out.println("Player 2 cards: " + Arrays.toString(p2));
            System.out.println("Player 3 cards: " + Arrays.toString(p3));
            System.out.println("Your cards: " + Arrays.toString(player_cards));
            System.out.println("Community cards: " + Arrays.toString(community_cards));
        }
    }

    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
