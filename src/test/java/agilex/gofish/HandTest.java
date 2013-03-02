package agilex.gofish;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: rayj
 * Date: 3/2/13
 * Time: 7:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class HandTest {
    @Test
    public void addCardToHand() throws Exception {
        Hand hand = new Hand();
        hand.addCardToHand(Card.Ace());
    }

    @Test
    public void checkCardInHand() throws Exception {
        Hand hand = new Hand();
        hand.addCardToHand(Card.Ace());

        Cards cards = hand.doYouHaveAny(Rank.Ace);
        assertEquals(1, cards.size());
        assertTrue(cards.get(0).isRank(Rank.Ace));
    }

    @Test
    public void checkThatCardRemovedFromHand() throws Exception {
        Hand hand = new Hand();
        hand.addCardToHand(Card.Ace());

        Cards cards = hand.doYouHaveAny(Rank.Ace);
        assertEquals(1, cards.size());
        assertTrue(cards.get(0).isRank(Rank.Ace));

        cards = hand.doYouHaveAny(Rank.Ace);
        assertEquals(0, cards.size());
    }
}
