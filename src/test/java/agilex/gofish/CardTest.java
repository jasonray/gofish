package agilex.gofish;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: rayj
 * Date: 3/2/13
 * Time: 7:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class CardTest {

    @Test
    public void construct() {
        Card card = new Card(Rank.Ace);
    }

    @Test(expected = IllegalArgumentException.class)
    public void dontAllowConstructWithNull() {
        Card card = new Card(null);
    }

    @Test
    public void checkRank() {
        Card card = new Card(Rank.Ace);
        assertTrue(card.isRank(Rank.Ace));
    }

    @Test
    public void checkRankNotEquals() {
        Card card = new Card(Rank.Ace);
        assertTrue(!card.isRank(Rank.Two));
    }
}
