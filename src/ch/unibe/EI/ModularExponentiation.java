package ch.unibe.EI;

public class ModularExponentiation {

    public static void main(String[] args) {
        int res = calcModularExponentiation(7, 151,15);
        System.out.println("Endresultat: " + res);
    }

    public static int calcModularExponentiation(int base, int exp, int mod) {
        int result = 1, counter = 0;
        String b = Integer.toBinaryString(exp);
        System.out.println(b);

        for (int i = 0; i < b.length(); i++) {
            String resultString = "";

            result = result * result % mod;
            counter++;
            resultString += result + "^2";
            if (b.charAt(i) == '1') {
                result = result * base % mod;
                resultString += " * " + base;
                // counter++;
            }
            System.out.println(counter + ". Zwischenresultat: " + resultString + " mod 15 =" + result);
        }

        return result;
    }
}
