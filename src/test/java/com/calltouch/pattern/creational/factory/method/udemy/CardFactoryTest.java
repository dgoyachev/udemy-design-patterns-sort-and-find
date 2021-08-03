package com.calltouch.pattern.creational.factory.method.udemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardFactoryTest {

    @Test
    public void cardFactoryTest() {
        CardFactory factory = new HoyleCardFactory(5, "spades");
        PlayingCard playingCard = factory.getPlayingCard();
        assertEquals(playingCard.getSuit(), "spades");
        assertEquals(playingCard.getType(), "Hoyle");
        assertEquals(playingCard.getValue(), 5);

        factory = new CongressCardFactory(6, "hearts");
        playingCard = factory.getPlayingCard();
        assertEquals(playingCard.getSuit(), "hearts");
        assertEquals(playingCard.getType(), "Congress");
        assertEquals(playingCard.getValue(), 6);
    }
}