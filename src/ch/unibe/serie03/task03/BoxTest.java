// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie03.task03;

/**
 * Contains different tests for the box and cargo classes
 */
public class BoxTest {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(2.5, 3,2);
        Box box3 = new Box(2, 1.5,2);

        Cargo cargo1 = new Cargo(1.5, 1, 1, "Smartphone");
        Cargo cargo2 = new Cargo(2, 2, 1, "Laptop");
        Cargo cargo3 = new Cargo(3, 4, 3, "Smart-TV");

        System.out.println("Capacity of all boxes:");
        System.out.println("Box1: " + box1.getCapacity());
        System.out.println("Box2: " + box2.getCapacity());
        System.out.println("Box3: " + box3.getCapacity());

        System.out.println("\nPrint all boxes out:");
        System.out.println("Box1: " + box1);
        System.out.println("Box2: " + box2);
        System.out.println("Box3: " + box3);

        // add cargos to boxes, it may fail (returns false) because the cargo is too big
        box1.addCargo(cargo1);
        box2.addCargo(cargo2);
        box3.addCargo(cargo3);

        System.out.println("\nPrint all boxes out again with added cargo:");
        System.out.println("Box1: " + box1);
        System.out.println("Box2: " + box2);
        System.out.println("Box3: " + box3);

        // change length of cargo1 to 1, try again to add cargo1 to box1
        System.out.println("\nPrint box1 again, after added smaller cargo1:");
        cargo1.setLength(1);
        box1.addCargo(cargo1);
        System.out.println("Box1: " + box1);
    }
}
