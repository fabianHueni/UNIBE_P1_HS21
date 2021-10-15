// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie03.task01;

/**
 * Contains different tests for the thermometer class
 */
public class ThermometerTest {

    public static void main(String[] args) {

        Thermometer thermometer1 = new Thermometer();
        Thermometer thermometer2 = new Thermometer();

        // tests for thermometer1
        thermometer1.increase();
        System.out.println(thermometer1.getTemperature());
        thermometer1.increase();
        System.out.println(thermometer1.getTemperature());
        thermometer1.reset();
        System.out.println(thermometer1.getTemperature());


        // tests for thermometer2
        thermometer2.increase();
        System.out.println(thermometer2.getTemperature());
        thermometer2.increase();
        System.out.println(thermometer2.getTemperature());
        thermometer2.reset();
        System.out.println(thermometer2.getTemperature());
    }
}
