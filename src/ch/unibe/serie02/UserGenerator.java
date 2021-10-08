// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie02;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class UserGenerator {
    private static final String FORMAT_USERNAME = "000";
    private static final String FORMAT_PASSWORD = "00000-";

    public static void main(String[] args) {
        String preName, lastName, userName, password = "";
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat(FORMAT_USERNAME);

        System.out.println("Geben Sie Ihren Vornamen ein:");
        preName = scanner.next();

        System.out.println("Geben Sie Ihren Nachnamen ein:");
        lastName = scanner.next();

        // create username from pre name, last name and a random number with exactly 3 digits
        userName = preName.substring(0, 1);
        userName += lastName.substring(0, Math.min(lastName.length(), 5));
        userName += decimalFormat.format(random.nextInt(999));

        System.out.println("Ihr Benutzername lautet: " + userName);

        // generate random password ------------------------------------------
        password += random.nextInt(2) + 7;

        decimalFormat.applyPattern(FORMAT_PASSWORD);
        password += decimalFormat.format(random.nextInt(99999));

        for (int i = 0; i < 3; i++) {
            password += (char) (random.nextInt(25) + 65);
        }

        System.out.println("Ihr Passwort lautet: " + password);
    }
}
