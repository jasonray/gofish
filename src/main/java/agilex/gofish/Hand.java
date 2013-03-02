package agilex.gofish;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: rayj
 * Date: 3/2/13
 * Time: 7:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class Hand {

    private Collection<Card> cards = new ArrayList<Card>();

    public void addCardToHand(Card card) {
        cards.add(card);
    }
}
