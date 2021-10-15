package ch.unibe.serie03.task03;

public class Cargo {
    private double length;
    private double width;
    private double height;
    private String name;

    public Cargo(double length, double width, double height, String name) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            System.out.println("The length has to be bigger than 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            System.out.println("The width has to be bigger than 0");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            System.out.println("The height has to be bigger than 0");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
