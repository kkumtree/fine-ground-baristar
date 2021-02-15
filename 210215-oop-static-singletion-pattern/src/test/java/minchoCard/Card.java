package minchoCard;

public class Card {
    private static int baseNumber = 10001;
    private int cardNumber;

    public void setCardNumber() {
        this.cardNumber = baseNumber++;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
