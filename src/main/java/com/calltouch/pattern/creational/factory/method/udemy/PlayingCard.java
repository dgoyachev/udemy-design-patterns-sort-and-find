package com.calltouch.pattern.creational.factory.method.udemy;

public class PlayingCard {
    private final String type;
    private final int value;
    private final String suit;

    public PlayingCard(String type, int value, String suit) {
        this.type = type;
        this.value = value;
        this.suit = suit;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "PlayingCard{" +
                "type='" + type + '\'' +
                ", value=" + value +
                ", suit='" + suit + '\'' +
                '}';
    }
}
