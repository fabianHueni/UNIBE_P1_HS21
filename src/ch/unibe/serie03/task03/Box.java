// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie03.task03;

/**
 * Class represents a box object with length, width, height,
 * one cargo object and a boolean which indicates, if the box is full.
 * There are tow constructors, one will set all sizes to 1,
 * the other takes the sizes as arguments.
 * We do not check if the sizes are appropriated (e.g. > 0)
 */
public class Box {
    private double length;
    private double width;
    private double height;
    private boolean full = false;
    private Cargo cargo;

    // default constructor
    public Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    // constructor with argument for all sizes
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // returns the calculated capacity
    public double getCapacity() {
        return length * width * height;
    }

    // adds a cargo object to the box if there is enough capacity (all sizes have fit)
    public boolean addCargo(Cargo cargo) {
        if (cargo.getLength() <= this.length
                && cargo.getWidth() <= this.width
                && cargo.getHeight() <= this.height) {
            this.cargo = cargo;
            this.full = true;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", full=" + full +
                ", cargo=" + cargo +
                '}';
    }
}
