package ch.unibe.serie06.task03;

/**
 * enum for material with a name and the cost of the material
 */
public enum Material {
    EICHE("Eiche", 20),
    BUCHE("Buche", 30),
    ESCHE("Esche", 25);

    public String name;
    public double materialCost;

    Material(String name, double materialCost) {
        this.name = name;
        this.materialCost = materialCost;
    }
}
