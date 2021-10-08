// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie01;

import java.util.Scanner;

public class TemperatureClassification {

    private static final int LIMIT_WARM = 24;
    private static final int LIMIT_COLD = 15;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie eine Temperatur ein:");
        int temperature = sc.nextInt();

        System.out.println("Klassifikation erfolgreich. Die Temperatur ist ");
        if (temperature >= LIMIT_WARM) {
            System.out.println("Warm");
        } else if (temperature < LIMIT_COLD) {
            System.out.println("Kalt");
        } else {
            System.out.println("Angenehm");
        }
    }
}
