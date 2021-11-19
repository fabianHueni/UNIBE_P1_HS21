package ch.unibe.serie06.task03;

/**
 * represents furniture as a parent of different furniture
 */
public class Furniture {
    public Material material;
    protected double pricePerHour;
    protected double workedHours;

    public Furniture(Material material, double pricePerHour, double workedHours) {
        this.material = material;
        this.pricePerHour = pricePerHour;
        this.workedHours = workedHours;
    }

    /**
     * calculates the price of the performed work
     * @return price of the performed work
     */
    public double calculateEffort() {
        return workedHours * pricePerHour;
    }
}
