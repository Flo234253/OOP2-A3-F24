package com.champlain.oop2assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

/**
 * Represents a deck of playing cards.
 * <p>
 * This class allows for creating a standard deck, shuffling it, drawing cards,
 * and checking if the deck is empty.
 * </p>
 */
public class Deck extends CardCollection implements CardSource {

    /**
     * The list of cards in the deck.
     */
    private final List<Card> aCards = new ArrayList<>();
    private static Deck instance = null;
    /**
     * Constructs a new Deck containing all standard playing cards.
     * The deck is initialized with one of each rank and suit combination.
     */
    private Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }
    public static Deck getInstance() {
        if (instance == null) {
            instance = new Deck();
        }
        return instance;
    }

    /**
     * Shuffles the cards in this deck randomly.
     */
    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    public Card draw() {
        int last = this.aCards.size()-1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     * Returns an iterator over the cards in this deck.
     *
     * @return an iterator for the cards
     */
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    /**
     * Sorts the deck of cards by rank first, then by suit. Yes
     */
    public void sortByRank() {
        this.aCards.sort(new SortRank()); // Use the SortRank comparator
    }

    /**
     * Sorts the deck of cards by suit first, then by rank.
     */
    public void sortBySuit() {
        this.aCards.sort(new SortSuit()); // Use the SortSuit comparator
    }
}


