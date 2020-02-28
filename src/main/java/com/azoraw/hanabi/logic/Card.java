package com.azoraw.hanabi.logic;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Card {
    private String id;
    private int number;
    private Color color;
}
