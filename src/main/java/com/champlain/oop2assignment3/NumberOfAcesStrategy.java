package com.champlain.oop2assignment3;

public class NumberOfAcesStrategy implements ScoringStrategy {
    /**
     * count number of ace in the drawn cards
     * @param pCards how many aces are drawn
     * @return number of ace in the drawn cards
     */
    @Override
    public int calculateScore(CardCollection pCards) {
        int aceCount = 0;
        for (Card card : pCards) {
            if (card.getRank() == Rank.ACE) {
                aceCount++;
            }
        }
        return aceCount;
    }


}
