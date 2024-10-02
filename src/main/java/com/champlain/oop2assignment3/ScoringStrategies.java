package com.champlain.oop2assignment3;

public class ScoringStrategies implements ScoringStrategy {
    /**
     *Calculates the score based on the size of the given card collection.
     * @param pCards the card collection to calculate the score from
     * @return the score, which is the size of the card collection
     */
    @Override
    public int calculateScore(CardCollection pCards) {
        return pCards.size();
    }

    /**
     * count number of ace in the drawn cards
     * @param pCards how many aces are drawn
     * @return number of ace in the drawn cards
     */
    public int countAces(CardCollection pCards) {
        int aceCount = 0;
        for (Card card : pCards) {
            if (card.getRank() == Rank.ACE) {
                aceCount++;
            }
        }
        return aceCount;
    }



}
