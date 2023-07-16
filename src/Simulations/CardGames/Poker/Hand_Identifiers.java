package Simulations.CardGames.Poker;

import java.util.*;

public class Hand_Identifiers {
    public static HashMap<String, Integer> values = new HashMap<>() {{
        put("A", 14);
        put("K", 13);
        put("Q", 12);
        put("J", 11);
        put("10", 10);
        put("9", 9);
        put("8", 8);
        put("7", 7);
        put("6", 6);
        put("5", 5);
        put("4", 4);
        put("3", 3);
        put("2", 2);
    }};
    public static void main(String[] args) {  // Test
        String[] player_cards = {"♣9", "♥J"};
        String[] community_cards = {"♦3", "♠4", "♠J", "♥K", "♠Q"};


        identify_hand(player_cards, community_cards);
    }

    public static void identify_hand(String[] playerCards, String[] communityCards) {
        List<String> cards = new ArrayList<>();
        cards.addAll(Arrays.asList(playerCards));
        cards.addAll(Arrays.asList(communityCards));

        if (Royal_Flush(cards)) {
            System.out.println("Royal Flush");
        } else if (Straight_Flush(cards)) {
            System.out.println("Straight Flush");
        } else if (Four_of_a_Kind(cards)) {
            System.out.println("Four of a Kind");
        } else if (Full_House(cards)) {
            System.out.println("Full House");
        } else if (Flush(cards)) {
            System.out.println("Flush");
        } else if (Straight(cards)) {
            System.out.println("Straight");
        } else if (Three_of_a_Kind(cards)) {
            System.out.println("Three of a Kind");
        } else if (Two_Pair(cards)) {
            System.out.println("Two Pair");
        } else if (One_Pair(cards)) {
            System.out.println("One Pair");
        } else {
            System.out.println("High Card");
        }
    }

    public static boolean Royal_Flush(List<String> cards) {
        return Straight_Flush(cards) && cards.contains("10") && cards.contains("A");
    }

    public static boolean Straight_Flush(List<String> cards) {
        return Flush(cards) && Straight(cards);
    }

    public static boolean Four_of_a_Kind(List<String> cards) {
        Map<Integer, Integer> valueCount = getValueCountMap(cards);
        return valueCount.containsValue(4);
    }

    public static boolean Full_House(List<String> cards) {
        Map<Integer, Integer> valueCount = getValueCountMap(cards);
        return valueCount.containsValue(3) && valueCount.containsValue(2);
    }

    public static boolean Flush(List<String> cards) {
        Set<String> suits = new HashSet<>();
        for (String card : cards) {
            suits.add(card.substring(1));
        }
        return suits.size() == 1;
    }

    public static boolean Straight(List<String> cards) {
        int n = cards.size();
        for (int i = 0; i < n - 1; i++) {
            int current = values.get(check_num(String.valueOf(cards.get(i).charAt(1))));
            int next = values.get(check_num(String.valueOf(cards.get(i + 1).charAt(1))));
            if (current + 1 != next) {
                return false;
            }
        }
        return true;
    }

    public static boolean Three_of_a_Kind(List<String> cards) {
        Map<Integer, Integer> valueCount = getValueCountMap(cards);
        return valueCount.containsValue(3);
    }

    public static boolean Two_Pair(List<String> cards) {
        Map<Integer, Integer> valueCount = getValueCountMap(cards);
        int pairCount = 0;
        for (int count : valueCount.values()) {
            if (count == 2) {
                pairCount++;
            }
        }
        return pairCount == 2;
    }

    public static boolean One_Pair(List<String> cards) {
        Map<Integer, Integer> valueCount = getValueCountMap(cards);
        return valueCount.containsValue(2);
    }
    private static Map<Integer, Integer> getValueCountMap(List<String> cards) {
        Map<Integer, Integer> valueCount = new HashMap<>();
        for (String card : cards) {
            int value = values.get(check_num(String.valueOf(card.charAt(1))));
            valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
        }
        return valueCount;
    }

    private static String check_num(String number) {
        return number.equals("1") ? "10" : number;
    }
}
