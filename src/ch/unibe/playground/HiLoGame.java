package ch.unibe.playground;

import java.util.Random;
import java.util.Scanner;

public class HiLoGame {

    private static final int MAX_NUMBER = 100;
    private static final Random random = new Random() ;
    private static final Scanner scanner = new Scanner(System.in);
    private static int randomNumber;

    public static void main(String[] args) {
        String playAgain;
        int numberOfGuesses = 1;


        do {
            randomNumber = random.nextInt(MAX_NUMBER - 1) + 1;
            while (nextGuess()) {
                numberOfGuesses++;
            }
            System.out.println("Sie haben " + numberOfGuesses + " Versuche benötigt.");
            System.out.println("Möchten Sie das Spiel erneut spielen? Antworten Sie mit Ja/Nein");
            playAgain = scanner.next();
            System.out.println(playAgain);
        } while (playAgain.equals("Ja"));
    }

    private static boolean nextGuess() {
        int inputNumber;
        System.out.println("Raten Sie ihre Zahl:");
        inputNumber = scanner.nextInt();
        if (inputNumber == randomNumber) {
            System.out.println("Bravo! Sie haben die Zahl erraten");
            return false;
        } else if (inputNumber < randomNumber) {
            System.out.println("Die Zahl ist grösser als Ihre Eingabe.");
            return true;
        } else {
            System.out.println("Die Zahl ist kleiner als Ihre Eingabe.");
            return true;
        }
    }
}
