// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie01;

import java.util.Scanner;

public class Divisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isValidInput = false;
        int num1 = 0, num2 = 0;

        while (!isValidInput) {
            System.out.println("Geben Sie den Zähler ein");
            num1 = sc.nextInt();

            System.out.println("Geben Sie den Nenner ein");
            num2 = sc.nextInt();

            isValidInput = (num2 != 0);
        }

        System.out.println("Berechnung erfolgreich durchgeführt. Resultate:");
        System.out.println("Gleitkommazahl: " + ((double) (num1 * num1) / num2));
        System.out.println("Ganzzahl mit Rest: " + ((num1 * num1) / num2) + " Rest " + (double)((num1 * num1) % num2));
    }
}
