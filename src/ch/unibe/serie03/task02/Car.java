package ch.unibe.serie03.task02;

import java.time.Year;

public class Car {

    private String brand;
    private String model;
    private int vintage;


    public Car(String brand, String model, int vintage) {
        this.brand = brand;
        this.model = model;
        this.vintage = vintage;
    }

    /**
     * returns true if the car is older than 45
     * @return boolean
     */
    public boolean isAntique() {
        return Year.now().getValue() - vintage > 45;
    }

    // Getter and setter for instanze variable
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    /**
     * create a string with all attributes of this class
     * Overrides the standard toString method
     * @return string
     */
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", vintage=" + vintage +
                '}';
    }
}
