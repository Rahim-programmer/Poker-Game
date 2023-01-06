public class Card {
    private String value;
    private CardSuit suit;

    public Card(String value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value + suit.getValue();
    }
}
