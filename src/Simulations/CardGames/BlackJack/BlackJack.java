package Simulations.CardGames.BlackJack;

import Simulations.CardGames.Resources.Kattio;

import java.io.*;
import java.util.*;

import static Simulations.CardGames.Resources.ShuffleDeck.shuffle_deck;

public class BlackJack {
    public static void main(String [] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        ArrayList<String> shuffled = shuffle_deck();
    }
}

