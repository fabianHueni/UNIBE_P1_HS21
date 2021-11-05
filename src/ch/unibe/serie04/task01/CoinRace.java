// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie04.task01;

/**
 * Simulates a coin race. The winner is the coin, which is three times in a row on the head side.
 * Prints out the result of each round as well as the end result.
 */
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
        else
            System.out.println("Münze 2 hat gewonnen!");
    }
}
