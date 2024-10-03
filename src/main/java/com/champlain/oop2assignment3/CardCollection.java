package com.champlain.oop2assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterable card collection overriding toString method.
 * String output contains all cards in the collection separated by new line chars.
 */
public abstract class CardCollection implements Iterable<Card>{

    /**
     * List called Card to add all the card
     */
    private final List<Card> cards = new ArrayList<>();

    /**
     * Add card to the list
     * @param card added to the list
     */
    public void addCard(Card card) {
        cards.add(card);
    }
    /**
     * Returns the number of card in the list
     * @return number of cards
     */
    public int size() {
        return cards.size();
    }

    /**
     * Returns an iterator over the cards in the list.
     * @return an iterator for the list
     */
    @Override
    public Iterator<Card> iterator() {
        return cards.iterator();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card currentCard : this) {
            result.append(currentCard.toString()).append("\n");
        }
        return result.toString();
    }
}
