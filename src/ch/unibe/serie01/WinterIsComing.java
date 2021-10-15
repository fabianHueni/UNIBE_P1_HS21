// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie01;

import java.text.DecimalFormat;

public class WinterIsComing {

    public static void main(String[] args) {
        // Version 1, Ausgabe auf einer Zeile
        System.out.println("Winter is coming");

        // Version 2: Ausgabe auf mehreren Zeilen
        System.out.println("Winter");
        System.out.println("is ");
        System.out.println("coming");

        DecimalFormat fmt = new DecimalFormat("000.0##");
        System.out.println(fmt.format(3));
        System.out.println(fmt.format(13.20));
        System.out.println(fmt.format(2134.201));
        System.out.println(fmt.format(0.1346));


    }
}