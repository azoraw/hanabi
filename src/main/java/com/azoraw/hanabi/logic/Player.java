package com.azoraw.hanabi.logic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Player {
    private final String name;
    private final List<Card> cards = new ArrayList<>();

}
