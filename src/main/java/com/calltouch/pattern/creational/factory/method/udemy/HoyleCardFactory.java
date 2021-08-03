package com.calltouch.pattern.creational.factory.method.udemy;

public class HoyleCardFactory extends CardFactory {

    private final int value;
    private final String suit;

    public HoyleCardFactory(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public PlayingCard getPlayingCard() {
        return new HoylePlayingCard(this.value, this.suit);
    }
}
