package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * Comparator for sorting cards by rank first, then suit.
 */
public class SortRank implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        // First, compare by rank
        int rankComparison = c1.getRank().compareTo(c2.getRank());

        // If ranks are the same, compare by suit
        if (rankComparison == 0) {
            return c1.getSuit().compareTo(c2.getSuit());
        }

        // Otherwise, return the result of the rank comparison
        return rankComparison;
    }
}
