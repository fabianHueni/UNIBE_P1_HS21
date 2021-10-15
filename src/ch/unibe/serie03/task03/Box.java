package ch.unibe.serie03.task03;

public class Box {
    private double length;
    private double width;
    private double height;
    private boolean full = false;
    private Cargo cargo;

    public Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public double getCapacity() {
        return length * width * height;
    }

    public boolean addCargo(Cargo cargo) {
        if (cargo.getLength() <= this.length && cargo.getWidth() <= this.width && cargo.getHeight() <= this.height) {
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
