package ch.unibe.serie06.task03;

public class Table extends Furniture{

    private double area;

    /**
     * constructor of a table
     *
     * @param material the chosen material
     * @param pricePerHour the price per hour
     * @param workedHours the worked hour for this table
     * @param area the area of the table
     */
    public Table(Material material, double pricePerHour, double workedHours, double area) {
        super(material, pricePerHour, workedHours);
        this.area = area;
    }

    /**
     * calculates the total price of a table depending on
     *  - the coast ot the choosen material
     *  - the area
     *  - the calculated effort (hours * pricePerHour)
     *
     * @return total price of the table
     */
    public double totalPrice() {
        return super.calculateEffort() + area * material.materialCost;
    }
}
