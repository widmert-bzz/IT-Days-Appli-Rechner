import java.util.Scanner;

public class Schritt2 {
  public static void main(String[] args) {

    Scanner meineEingabe = new Scanner(System.in);

    System.out.println("Hallo!");
    System.out.print("Gib deine erste Zahl ein: ");

    int ersteZahl = meineEingabe.nextInt();

    System.out.print("Gib deine zweite Zahl ein: ");

    int zweiteZahl = meineEingabe.nextInt();


    float resulat = ersteZahl + zweiteZahl;

    System.out.println(resulat);
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
}
