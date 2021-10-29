package ch.unibe.serie04.task01;

public class CoinRace {

    public static void main(String[] args) {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        int roundCounter = 0, counterHead1 = 0, counterHead2 = 0;

        do {
            roundCounter++;

            coin1.flip();
            coin2.flip();

            counterHead1 = coin1.isHead() ? ++counterHead1 : 0;
            counterHead2 = coin2.isHead() ? ++counterHead2 : 0;

            System.out.println("Runde " + roundCounter + ": " + coin1 + " - " + coin2);
        } while (counterHead1 < 3 && counterHead2 < 3);

        if (counterHead1 == 3 && counterHead2 == 3)
            System.out.println("Wir haben ein Unentschieden!!");
        else if (counterHead1 == 3)
            System.out.println("Münze 1 hat gewonnen!");
        else if (counterHead2 == 3)
            System.out.println("Münze 2 hat gewonnen!");
    }
}
