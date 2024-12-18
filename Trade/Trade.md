# Informatiktage 2024 Trade

- [Teil 1 - Grundcode eines Java File](#Teil-1)
- [Teil 2 - Rechnen mit Variablen](#teil-2)

## Teil-1

### 1.1
Heute werden wir einen Zuckerrechner mit Java Programmieren.

Der Zuckerrechner baut auf deinem Lieblingsgetränk auf, er fragt dich wie viel du in einer Woche von deinem Lieblingsgetränk trinkst und rechnet dann aus wie viel Zucker das im Jahr ist.

Im bereitgestellten Projekt befindet sich eine Datei namens Main.java.
In diese Datei schreiben wir unseren Java Code.

Diese Datei ist jedoch nicht leer.
Sie beinhaltet den Grund Code welchen wir brauchen, dass der Code überhaupt ausgeführt werden kann.
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
 
    }
}
```

Jeglicher Code, den du schreibst, kommt in die Class "Main" welche auf Zeile 2 beginnt bis vor dem letzten " } ".
```java
public class Main {
    // Hier kommt dein Code
}
```

Im ersten Teil werden wir auch nur in die "main" Funktion zwischen den "{}" schreiben.
```java
public static void main(String[] args) {
  
}
```
Später werden wir noch weitere Funktionen schreiben.

Zuerst geben wir Text in die Konsole aus. In der Konsole werden wir heute unseren Code ausführen und bedienen.

Um etwas auszugeben, nutzen wir den Befehl System.out.println("");
Zwischen den "" kann man den Text angeben, welcher dann in die Konsole ausgegeben wird.

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hallo!");
  }
}
```
Hier kannst du den Code einmal ausführen es sollte "Hallo!" in der Konsole stehen.
Du kannst den Code immer wieder einmal ausprobieren.

### 1.2

Mit dem  ```Import java.util.Scanner``` importieren wir einen anderen Codeschnipsel welcher wir hier brauchen werden. Er ermöglicht uns eingaben in der Konsole zu machen. Dies sollst du ganz am anfang hinschreiben.

Um den Scanner (die Eingabe) zu erlauben erstellen wir einen neuen Scanner.
```java
Scanner meineEingabe = new Scanner(System.in);
```

Als Nächstes ändern wir noch die Ausgabe ab die du oben gemacht hast, neu soll sie "Wie viel Cola trinkst du davon pro Woche?" ausgeben. (Du kannst auch ein anderes Getränk nehmen)

Um jetzt damit wirklich eine Zahl entgegenzunehmen, schreiben wir das:

```java
int anzahl = meineEingabe.nextInt();
```
```int``` steht für "Ganzzahl"

Hier Rechnen wir jetzt Anzahl Getränke mal Anzahl Wochen, um die Anzahl Getränke pro Jahr zu bekommen.

```java
 int resultat = anzahl * 52;
```

Anschliessend geben wir noch das Resultat in einem Satz aus.

```java
System.out.println("Du trinktst " + resultat + " pro Jahr");
```
Info: Wenn man bei einer Ausgabe keine Anführungszeichen "" verwendet wird die Variable verwendet.

## Teil-2

### 2.1
In diesem Teil erweitern wir die berechnung um die Menge an Zucker.

Zuerst kannst du 2 neue Variablen ganz am Anfang der main Methode definieren.

```java
    String Getraenk = "Getränk deiner Wahl";
    int zuckerInGramm = Zuckergehalt;
```
### 2.2
Setze dazu noch dein Getränk ein und wie viel g Zucker dieses hat. (Den Zuckergehalt kannst du im Internet recherchieren)

Anschliessend ersetzt du ```System.out.println("Wie viel Cola trinkst du davon pro Woche?");```
mit ```System.out.println("Wie viel " + Getraenk + " trinkst du davon pro Woche?");```.

Dann sollst du dir Rechnung anpassen so das es noch mit "zuckerInGramm" multipliziert wird.

Verändere danach noch die Ausgabe das sie so aussieht:
```java
System.out.println("Das macht insgesamt " + resultat + "g Zucker pro Jahr.");
```

## Teil-3
### 3.1
Bis jetzt kann man nur ein Getränk ausgeben jetzt erweitern
wir das Programm so das man mehrere Getränke angeben kann. Dafür erstellen wir zuerst 2 Listen.

In der einen Speichern wir die Getränkenamen in der anderen den jeweiligen Zuckergehalt: (Auch hier kanst du wieder eigene Werte Benutzen)
```java
    String[] Getraenk = {"Cola", "Fanta", "Red Bull"};
    int[] zuckerInGramm = {100, 200, 300};
```
### 3.2
Als nächstes machen wir einen Loop dieser wird widerholt alles was darin ist mehrmals.
In diesem fall wiederholt er sich für jeden eintrag in der Getränkeliste einmal:
```java
for (int i = 0; i < Getraenk.length; i++) {

    }
```

In diesen Loop fügst du zuerst diese Ausgabe ein:
```java
System.out.println("Wie viel " + Getraenk[i] + " trinkst du davon pro Woche?");
```
Info: ```Getraenk[i]``` steht innderhalb des Loops für das jeweilige getränk der Liste (Erste wiederholung -> Cola, Zweite wiederholung Fanta ...)

anschliessend sollte die eingabe des Ints erfolgen: (diese Zeile haben wir schon wir müssen sie nur noch verschieben)
```java
int anzahl = meineEingabe.nextInt();
```

Nun sollte die berechnung durchgeführt werden und anschliessend ausgegeben werden:
```java
System.out.println("Das mach insgesamt " + resultat + "g Zucker pro Jahr.");
```

## Teil-4
### 4.1
In diesem Teil schauen wir an wie man anstatt jedes mal alle Getränke abzufragen und zu berechnen nur das gewünschte Getränk berechnet.

Die ersten 3 Zeilen können wir so belassen:
```java
    Scanner meineEingabe = new Scanner(System.in);

    String[] Getraenk = {"Cola", "Fanta", "Red Bull"};

    int[] zuckerInGramm = {100, 200, 300};
```

Anschliessend Fragen wir nach einer Getränkenummer und geben die getränke mit ihrer Nummer zusammen aus und nehmen einen Input entgegen:
```java
    System.out.println("Hallo, Wähle ein Getränk mit der Zahl aus: ");

    for (int i = 0; i < Getraenk.length; i++) {
        System.out.println(i + 1 + ". " + Getraenk[i]);
    }
int getraenkeNr = meineEingabe.nextInt() - 1;
```
### 4.2
Als nächstes Fragen wir nach wie viel man davon trinkt und nehmen die Eingabe dafür:
```
    System.out.println("Wie viel " + Getraenk[getraenkeNr] + " trinkst du davon pro Woche?");
    int anzahl = meineEingabe.nextInt();
```
Die Rechnung verändert sich leicht: (```zuckerInGramm[getraenkeNr]``` gibt den wert aus der Liste zurück)
````java
int resultat = zuckerInGramm[getraenkeNr]  * anzahl;
````


Als letztes kannst du nun wieder das Resultat ausgeben:
```java
System.out.println("Du trinktst " + resultat + "g " + Getraenk[getraenkeNr] + " pro Jahr");
```












