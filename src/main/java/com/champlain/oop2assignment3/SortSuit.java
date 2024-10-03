package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * Comparator for sorting cards by suit first, then rank.
 */
public class SortSuit implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        // First, compare by suit
        int suitComparison = c1.getSuit().compareTo(c2.getSuit());

        // If suits are the same, compare by rank
        if (suitComparison == 0) {
            return c1.getRank().compareTo(c2.getRank());
        }

        // Otherwise, return the result of the suit comparison
        return suitComparison;
    }
}