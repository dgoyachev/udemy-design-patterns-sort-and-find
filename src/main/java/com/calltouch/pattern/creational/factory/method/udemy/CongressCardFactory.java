package com.calltouch.pattern.creational.factory.method.udemy;

public class CongressCardFactory extends CardFactory {

    private final int value;
    private final String suit;

    public CongressCardFactory(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public PlayingCard getPlayingCard() {
        return new CongressPlayingCard(this.value, this.suit);
    }
}
