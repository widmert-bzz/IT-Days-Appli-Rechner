import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Schritt4 {
    public static void main(String[] args) {

        Scanner meineEingabe = new Scanner(System.in);

        System.out.println("Hallo!");

        System.out.println("Gib einen Operator ein (+, -, *, /, %) oder die Funktion (potenz, wurzel, fakultät)");

        String operator = meineEingabe.next();

        if (Objects.equals(operator, "+") || Objects.equals(operator, "-") || Objects.equals(operator, "*") || Objects.equals(operator, "/") || Objects.equals(operator, "%") || Objects.equals(operator, "potenz")){
            System.out.print("Gib deine erste Zahl ein: ");

            int ersteZahl = meineEingabe.nextInt();

            System.out.print("Gib deine zweite Zahl ein: ");

            int zweiteZahl = meineEingabe.nextInt();

            switch (operator) {
                case "+":
                    plus(ersteZahl, zweiteZahl);
                    break;
                case "-":
                    minus(ersteZahl, zweiteZahl);
                    break;
                case "*":
                    mal(ersteZahl, zweiteZahl);
                    break;
                case "/":
                    geteilt(ersteZahl, zweiteZahl);
                    break;
                case "%":
                    modulo(ersteZahl, zweiteZahl);
                    break;
                case "potenz":
                    potenz(ersteZahl, zweiteZahl);
                    break;
                default:
                    System.out.println("Dieser Operator gibt es nicht.");
            }
        }else if (Objects.equals(operator, "wurzel") || Objects.equals(operator, "fakultät")) {
            System.out.println("Gib bitte eine Zahl ein");
            int ersteZahl = meineEingabe.nextInt();
            if (operator.equals("wurzel")) {
                wurzel(ersteZahl);
            } else if (operator.equals("fakultät")) {
                fakultat(ersteZahl);
            }
        } else {
            System.out.println("Diesen Operator gibt es nicht.");
            System.exit(0);
        }



    }

    static void plus(int ersteZahl, int zweiteZahl) {
        System.out.println(ersteZahl + zweiteZahl);
    }

    static void minus(int ersteZahl, int zweiteZahl) {
        System.out.println(ersteZahl - zweiteZahl);
    }

    static void mal(int ersteZahl, int zweiteZahl) {
        System.out.println(ersteZahl * zweiteZahl);
    }

    static void geteilt(int ersteZahl, int zweiteZahl) {
        System.out.println(ersteZahl / zweiteZahl);
    }
    static void modulo(int ersteZahl, int zweiteZahl) {
        System.out.println(ersteZahl % zweiteZahl);
    }
    static void potenz(int ersteZahl, int zweiteZahl) {
        System.out.println(ersteZahl^zweiteZahl);
    }
    static void wurzel(int ersteZahl) {
        System.out.println(sqrt(ersteZahl));
    }
    static void fakultat(int ersteZahl) {
        int ergebniss = 1;
        for (int i = 1; i <= ersteZahl; i++) {
            ergebniss = ergebniss * i;
        }
        System.out.println(ergebniss);
    }
}
