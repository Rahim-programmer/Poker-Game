public enum CardSuit {
    HEARTS('\u2660'),
    TILES('\u2665'),
    CLOVES('\u2666'),
    PIKES('\u2663');

    private Character value;

    CardSuit(Character value) {
        this.value = value;
    }

    public Character getValue() {
        return value;
    }
}
