// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie03.task03;

/**
 * Class represents a cargo object with length, width, height and a name.
 * The sizes had to be bigger than zero, which is checked in the setter methods.
 * Therefore, we use these methods already in the constructor.
 */
public class Cargo {
    private double length;
    private double width;
    private double height;
    private String name;

    public Cargo(double length, double width, double height, String name) {
        setLength(length);
        setWidth(width);
        setHeight(height);
        this.name = name;
    }

    /* Getters and Setters ------------------------------------------------------------ */
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

    /**
     * Override the toString methode with own implementation
     * @return string with all variables
     */
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
