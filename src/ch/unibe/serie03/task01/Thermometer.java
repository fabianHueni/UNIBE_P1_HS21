// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie03.task01;

public class Thermometer {

    private double temperature;
    private final double STANDARD_TEMPERATURE = 37.0;

    public Thermometer() {
        temperature = STANDARD_TEMPERATURE;
    }

    public void increase() {
        temperature += 0.1;
    }

    public void reset() {
        temperature = STANDARD_TEMPERATURE;
    }

    public double getTemperature() {
        return temperature;
    }
}
