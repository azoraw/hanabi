package com.zoraw.hanabi.logic;

import java.util.HashMap;
import java.util.Map;

public class Settings {

    private static final Map<Integer, Integer> numberOfCardsOnHand;
    static {
        numberOfCardsOnHand = new HashMap<>();
        numberOfCardsOnHand.put(2, 5);
        numberOfCardsOnHand.put(3, 5);
        numberOfCardsOnHand.put(4, 4);
        numberOfCardsOnHand.put(5, 4);
    }

    public static int getNumberOfCards(int numberOfPlayers) {
        return numberOfCardsOnHand.get(numberOfPlayers);
    }
}
