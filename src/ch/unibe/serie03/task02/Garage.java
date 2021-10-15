package ch.unibe.serie03.task02;

public class Garage {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "E-Tron", 2018);
        Car car2 = new Car("VW", "ID4", 2020);
        Car car3 = new Car("VW", "Golf", 1950);

        // Print all information from car1
        System.out.println(car1.getModel());
        System.out.println(car1.getBrand());
        System.out.println(car1.getVintage());
        System.out.println("Is antique: " + car1.isAntique());

        // Print car2 with toString()
        // Method (to string is not necessary, because we override the standard to String method)
        System.out.println(car2);

        // Change all Data of Car3 and print it out
        System.out.println(car3);

        car3.setBrand("BMW");
        car3.setModel("X3");
        car3.setVintage(2008);

        System.out.println(car1);
        System.out.println("Is antique: " + car1.isAntique());
    }
}
