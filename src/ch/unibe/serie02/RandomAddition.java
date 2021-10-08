// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie02;

import java.util.Random;
import java.util.Scanner;

public class RandomAddition {

    public static final int MAX_RESULT = 20;

    public static void main(String[] args) {
        int summand1, summand2, result;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        summand1 = random.nextInt(20);
        summand2 = random.nextInt(MAX_RESULT - summand1);

        System.out.println("Berechnen Sie die folgende Addition: " + summand1 + " + " + summand2);
        result = scanner.nextInt();

        if (result == summand1 + summand2)
            System.out.println("Das Resultat ist korrekt. Bravo!");
        else
            System.out.println("Das Resultat ist leider falsch...");
    }
}
