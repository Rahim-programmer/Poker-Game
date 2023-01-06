public class Hand {
    private Card[] cards = new Card[5];

    public void addCardToHand(Card card) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = card;
                break;
            }
        }
    }

    public Card changeSingleCard(Card newCard, int index) {
        Card oldCard = cards[index];
        cards[index] = newCard;
        return oldCard;
    }

    @Override
    public String toString() {
        StringBuilder position = new StringBuilder();
        String positionFmt = " %-5s |";
        StringBuilder card = new StringBuilder();
        String cardFmt = " %-5s |";
        for (int i = 0; i < cards.length; i++) {
            position.append(String.format(positionFmt, i + 1));
            card.append(String.format(cardFmt, cards[i].toString()));
        }
        position.append("\n");
        return position + card.toString();
    }
}
