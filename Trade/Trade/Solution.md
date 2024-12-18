#### Lösung Teil 1
```java
public class Main {
  public static void main(String[] args) {
    Scanner meineEingabe = new Scanner(System.in);

    System.out.println("Hallo!");
    System.out.println("Wie viel Cola trinkst du davon pro Woche?");

    int anzahl = meineEingabe.nextInt();

    int resultat = anzahl * 52;

    System.out.println("Du trinktst " + resultat + " pro Jahr");
  }
}
```

#### Lösung Teil 2
```java
public class Main {
  public static void main(String[] args) {
    String Getraenk = "Cola";
    int zuckerInGramm = 120;

    Scanner meineEingabe = new Scanner(System.in);

    System.out.println("Hallo!");
    System.out.println("Wie viel " + Getraenk + " trinkst du davon pro Woche?");

    int anzahl = meineEingabe.nextInt();

    int resultat = anzahl * zuckerInGramm * 52;

    System.out.println("Das mach insgesamt " + resultat + "g Zucker pro Jahr.");
  }
}
```

#### Lösung Teil 3
```java
public class Main {
  public static void main(String[] args) {
    Scanner meineEingabe = new Scanner(System.in);

    String[] Getraenk = {"Cola", "Fanta", "Red Bull"};

    int[] zuckerInGramm = {100, 200, 300};

    for (int i = 0; i < Getraenk.length; i++) {
      System.out.println("Wie viel " + Getraenk[i] + " trinkst du davon pro Woche?");

      int anzahl = meineEingabe.nextInt();

      int resultat = anzahl * zuckerInGramm[i] * 52;

      System.out.println("Das mach insgesamt " + resultat + "g Zucker pro Jahr.");
    }
  }
}
```
#### Lösung Teil 4
```java
public class Main {
  public static void main(String[] args) {
    Scanner meineEingabe = new Scanner(System.in);

    String[] Getraenk = {"Cola", "Fanta", "Red Bull"};

    int[] zuckerInGramm = {100, 200, 300};

    System.out.println("Hallo, Wähle ein Getränk mit der Zahl aus: ");

    for (int i = 0; i < Getraenk.length; i++) {
      System.out.println(i + 1 + ". " + Getraenk[i]);
    }

    int getraenkeNr = meineEingabe.nextInt() - 1;

    System.out.println("Wie viel " + Getraenk[getraenkeNr] + " trinkst du davon pro Woche?");
    int anzahl = meineEingabe.nextInt();

    int resultat = zuckerInGramm[getraenkeNr]  * anzahl;

    System.out.println("Du trinktst " + resultat + "g " + Getraenk[getraenkeNr] + " pro Jahr");

  }
}
```