import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    @Test
    public void testGetGreaterCardForDifferentSuits() {

        Card card1 = new Card(Card.Suit.Club, Card.CardNumber.Five);
        Card card2 = new Card(Card.Suit.Diamond, Card.CardNumber.Five);

        Card greaterCard = card1.getGreaterCard(card2);
        Assert.assertEquals(greaterCard, card1);

    }

    @Test
    public void testGetGreaterCardForDifferentCardNumber() {

        Card card1 = new Card(Card.Suit.Club, Card.CardNumber.Five);
        Card card2 = new Card(Card.Suit.Club, Card.CardNumber.Seven);

        Card greaterCard = card1.getGreaterCard(card2);
        Assert.assertEquals(greaterCard, card2);

    }



}
