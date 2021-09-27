public class Card {

    private final Suit suit;
    private final CardNumber cardNumber;

    public Card(Suit suit, CardNumber cardNumber) {
        this.suit = suit;
        this.cardNumber = cardNumber;
    }


    public enum Suit {
        Diamond(1),
        Heart(2),
        Club(3),
        Spade(4);

        Suit(int i) {
        }
    }

    public enum CardNumber {
        Two(2),
        Three(3),
        Four(4),
        Five(5),
        Six(6),
        Seven(7);

        CardNumber(int rank) {
        }
    }


    public Card getGreaterCard(Card other) {

        if (this.suit == other.suit) {
            return (this.cardNumber.compareTo(other.cardNumber)) > 0 ? this : other;
        }
        return this.suit.compareTo(other.suit) > 0 ? this : other;

    }


}
