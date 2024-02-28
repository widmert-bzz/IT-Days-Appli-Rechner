import java.util.Scanner;

public class Schritt2 {
    public static void main(String[] args) {

        Scanner meineEingabe = new Scanner(System.in);

        System.out.println("Hallo!");

        System.out.println("Gib einen Operator ein (+, -, *)");

        String operator = meineEingabe.next();

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
            default:
                System.out.println("Dieser Operator gibt es nicht.");
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
}
