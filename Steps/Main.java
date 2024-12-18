import java.util.Scanner;

public class Main {
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
}