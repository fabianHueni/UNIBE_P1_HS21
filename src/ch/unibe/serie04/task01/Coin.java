// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie04.task01;

import java.util.Random;

public class Coin {
    private boolean isHead;
    private Random random = new Random();

    public Coin() {
        this.flip();
    }

    /**
     * Generates a new random boolean represents head or number
     */
    public void flip() {
        this.isHead = random.nextBoolean();
    }


    /**
     * Check if two coins do have the same value
     *
     * @param coin2 Second coin object to check
     * @return true if both coins are equals
     */
    public boolean equals(Coin coin2) {
        return this.isHead == coin2.isHead();
    }

    @Override
    public String toString() {
        return (this.isHead) ? "Kopf": "Zahl";
    }

    /**
     * Checks if the coin has the value head
     * @return
     */
    public boolean isHead() {
        return isHead;
    }
}
