import java.util.Scanner;

public class Game {
    private static final Deck DECK = new Deck();
    private static final Hand HAND = new Hand();

    public static void runGame() {
        Game game = new Game();
        DECK.shuffleDeck();

        game.dealCards();
        game.printHand();
        game.userChoice();
        game.printHand();
    }

    private void dealCards() {
        for (int i = 0; i < 5; i++) {
            HAND.addCardToHand(DECK.getSingleCardFromDeck());
        }
    }

    private void userChoice() {
        System.out.println("Введите номера карт, которые вы хотите заменить через пробел.\n" +
                "Например, \"0 3 4\" заменят 0, 3 и 4 карты соответственно");
        String[] positions = new Scanner(System.in).nextLine().split(" ");
        int[] cardPositions = new int[positions.length];
        for (int i = 0; i < positions.length; i++) {
            cardPositions[i] = Integer.parseInt(positions[i]);
        }
        changeCards(cardPositions);
    }

    private void changeCards(int[] cardsPosition) {
        for (int index : cardsPosition) {
            HAND.changeSingleCard(DECK.getSingleCardFromDeck(), index - 1);
        }
    }

    private void printHand() {
        System.out.println(HAND);
    }
}
