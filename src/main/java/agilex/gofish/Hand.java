package agilex.gofish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: rayj
 * Date: 3/2/13
 * Time: 7:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class Hand {

    private Cards cards = new Cards();

    public void addCardToHand(Card card) {
        cards.add(card);
    }

    public Cards doYouHaveAny(Rank rank) {
        Cards cardsFromHandThatMatchRank = new Cards();

        for (Iterator<Card> cardIterator = cards.iterator(); cardIterator.hasNext(); ) {
            Card card = cardIterator.next();
            if (card.isRank(rank)) {
                cardsFromHandThatMatchRank.add(card);
                cardIterator.remove();
            }
        }
        return cardsFromHandThatMatchRank;
    }
}
