import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] cards = new Card[52];

    public Deck() {
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        CardSuit[] suits = CardSuit.values();

        int count = 0;
        for (CardSuit suit : suits) {
            for (String value : values) {
                cards[count] = new Card(value, suit);
                count++;
            }
        }
    }

    public Card getSingleCardFromDeck() {
        Card card = cards[0];

        cards[0] = null;
        cards = Arrays.copyOfRange(cards, 1, cards.length + 1);
        return card;
    }

    public void returnCardToDeck(Card card) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = card;
                break;
            }
        }
    }

    public void shuffleDeck(){
        Random rd = new Random();
        for (int i = cards.length-1; i >= 0; i--) {
            int j = rd.nextInt(i+1);

            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }
}
