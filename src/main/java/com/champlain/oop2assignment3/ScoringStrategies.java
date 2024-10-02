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


}
