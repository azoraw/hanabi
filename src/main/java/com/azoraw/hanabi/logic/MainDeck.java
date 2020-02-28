package com.azoraw.hanabi.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class MainDeck {

    private static final int[] numbersDistribution = {3, 2, 2, 2, 1};
    private List<Card> cards;

    public MainDeck() {
        initDeck();
        shuffle();
    }

    public List<Card> drawCards(int numberOfCards) {
        List<Card> cards = this.cards.subList(0, numberOfCards);
        this.cards.subList(0, numberOfCards).clear();
        return cards;
    }

    private void initDeck() {
        cards = new ArrayList<>();
        for (Color color : Color.values()) {
            for (int index = 0; index < numbersDistribution.length; index++) {
                for (int cardNumber = 1; cardNumber <= numbersDistribution[index]; cardNumber++) {
                    cards.add(createCard(index + 1, color));
                }
            }
        }
    }

    private Card createCard(int cardNumber, Color color) {
        return Card.builder()
                .id(UUID.randomUUID().toString())
                .color(color)
                .number(cardNumber)
                .build();
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }
}
