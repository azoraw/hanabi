package com.azoraw.hanabi.logic;

import java.util.List;

public class Game {

    private List<Player> players;
    private final MainDeck mainDeck;

    public Game() {
        mainDeck = new MainDeck();
    }

    public void addPlayer(String playerName) {
        players.add(new Player(playerName));
    }

    public void start() {
        int numberOfCards = Settings.getNumberOfCards(players.size());
        players.forEach(player -> giveCards(numberOfCards, player));
    }

    private void giveCards(int numberOfCards, Player player) {
        player.getCards()
                .addAll(mainDeck.drawCards(numberOfCards));
    }
}
