package ch.unibe.serie04.task02;

/**
 * represents a pair of dices with methods for
 *  - set the points of one of the dice
 *  - roll both dices
 *  - get the sum of both dices
 */
public class PairOfDice {

    Dice dice1 = new Dice();
    Dice dice2 = new Dice();


    /**
     * Set the points of dice 1
     * @param points
     */
    public void setPointsOfDice1(int points) {
        this.dice1.setPoints(points);
    }

    /**
     * Set the points of dice 2
     * @param points
     */
    public void setPointsOfDice2(int points) {
        this.dice2.setPoints(points);
    }


    /**
     * roll both dices
     */
    public void rollDices() {
        this.dice1.roll();
        this.dice2.roll();
    }

    /**
     * @return the sum of points from both dices
     */
    public int getSumFromDices() {
        return this.dice1.getPoints() + this.dice2.getPoints();
    }
}
