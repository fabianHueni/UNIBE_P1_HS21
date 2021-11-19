package ch.unibe.serie06.task03;

public class Table extends Furniture{

    private double area;

    public Table(Material material, double pricePerHour, double workedHours, double area) {
        super(material, pricePerHour, workedHours);
        this.area = area;
    }

    public double totalPrice() {
        return super.calculateEffort() + area * material.materialCost;
    }
}
