package com.zoraw.hanabi.logic

import spock.lang.Specification
import spock.lang.Unroll

import java.util.stream.Collectors

class MainDeckTest extends Specification {

    @Unroll
    def "should create #size #color #number cards  "() {
        given:
        def deck = new MainDeck()

        expect:
        deck.cards.stream()
                .filter({ card -> card.color == color })
                .filter({ card -> card.number == number })
                .collect(Collectors.toList())
                .size() == size

        where:
        color        | number || size
        Color.BLUE   | 1      || 3
        Color.BLUE   | 2      || 2
        Color.BLUE   | 3      || 2
        Color.BLUE   | 4      || 2
        Color.BLUE   | 5      || 1

        Color.YELLOW | 1      || 3
        Color.YELLOW | 2      || 2
        Color.YELLOW | 3      || 2
        Color.YELLOW | 4      || 2
        Color.YELLOW | 5      || 1

        Color.WHITE  | 1      || 3
        Color.WHITE  | 2      || 2
        Color.WHITE  | 3      || 2
        Color.WHITE  | 4      || 2
        Color.WHITE  | 5      || 1

        Color.RED    | 1      || 3
        Color.RED    | 2      || 2
        Color.RED    | 3      || 2
        Color.RED    | 4      || 2
        Color.RED    | 5      || 1

        Color.GREEN  | 1      || 3
        Color.GREEN  | 2      || 2
        Color.GREEN  | 3      || 2
        Color.GREEN  | 4      || 2
        Color.GREEN  | 5      || 1
    }
}
