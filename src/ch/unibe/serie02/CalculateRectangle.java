// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie02;

import java.util.Scanner;

public class CalculateRectangle {

    public static void main(String[] args) {
        double length, width;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die länge ein:");
        length = scanner.nextDouble();

        System.out.println("Geben Sie die breite ein:");
        width= scanner.nextDouble();

        System.out.println("Das Rechteck hat eine Fläche von "
                + (length * width)
                + " und einen Umfang von " + (2 * length + 2 * width));

        if  (length == width)
            System.out.println("Beim Rechteck handelt es sich um ein Quadrat");
    }
}
