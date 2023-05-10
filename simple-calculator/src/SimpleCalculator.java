import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean weitermachen = true; //Der Wert der es ermöglicht den Code weiter funktionieren zulassen

        while (weitermachen) {

            System.out.print("Gib die erste Zahl ein: ");
            int zahl1 = 0;

            if (input.hasNextInt()) {
                zahl1 = input.nextInt();
                if (zahl1 > 10) { // Wenn die Zahl größer als 10 ist, gib eine Fehlermeldung aus und starte die Schleife neu
                    System.out.println("Die eingegebene Zahl ist zu gross. Bitte gib eine Zahl bis zu 10 ein.");
                    continue;
                }
            } else { // Wenn keine gueltige Zahl eingegeben wurde, gib eine Fehlermeldung aus und starte die Schleife neu
                System.out.println("Ungueltige Eingabe. Bitte gib eine Zahl oder einen Operator ein.");
                input.next();
                continue;
            }

            System.out.print("Gib den Operator ein (+, -, *, /): ");
            char operator = ' ';

            if (input.hasNext()) {
                String next = input.next();
                if (next.length() == 1) {
                    operator = next.charAt(0);
                    if (operator != '+' && operator != '-' && operator != '*' && operator != '/') { // Wenn der Operator ungueltig ist, gib eine Fehlermeldung aus und starte die Schleife neu
                        System.out.println("Ungueltiger Operator. Bitte gib einen gueltigen Operator ein.");
                        continue;
                    }
                } else { // Wenn keine gueltige Operation eingegeben wurde, gib eine Fehlermeldung aus und starte die Schleife neu
                    System.out.println("Ungueltige Eingabe. Bitte gib eine Zahl oder einen Operator ein.");
                    continue;
                }
            } else { // Wenn keine gueltige Operation eingegeben wurde, gib eine Fehlermeldung aus und starte die Schleife neu
                System.out.println("Ungültige Eingabe. Bitte gib eine Zahl oder einen Operator ein.");
                continue;
            }

            System.out.print("Gib die zweite Zahl ein: ");
            int zahl2 = 0;

            if (input.hasNextInt()) {
                zahl2 = input.nextInt();
                if (zahl2 > 10) { // Wenn die Zahl groesser als 10 ist, gib eine Fehlermeldung aus und starte die Schleife neu
                    System.out.println("Die eingegebene Zahl ist zu gross. Bitte gib eine Zahl bis zu 10 ein.");
                    continue;
                }
            } else { // Wenn keine gueltige Zahl eingegeben wurde, gib eine Fehlermeldung aus und starte die Schleife neu
                System.out.println("Ungueltige Eingabe. Bitte gib eine Zahl oder einen Operator ein.");
                input.next();
                continue;
            }

            int ergebnis;

            //Was mit den Variablen passiert wenn folgenden Operator benutzt
            switch (operator) {
                case '+':
                    ergebnis = zahl1 + zahl2;
                    System.out.println("Ergebnis: " + ergebnis);
                    break;
                case '-':
                    ergebnis = zahl1 - zahl2;
                    System.out.println("Ergebnis: " + ergebnis);
                    break;
                case '*':
                    ergebnis = zahl1 * zahl2;
                    System.out.println("Ergebnis: " + ergebnis);
                    break;
                case '/':
                    if (zahl2 == 0) {
                        System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
                    } else {
                        ergebnis = zahl1 / zahl2;
                        System.out.println("Ergebnis: " + ergebnis);
                    }
                    break;
            }

            //Fragt nach ob man weiter machen möchte
            System.out.print("Möchtest du weitermachen? (J/N) ");
            char antwort = input.next().charAt(0);

            //Checkt mittels IF statement ob man weiter machen möchte oder nicht
            if (antwort == 'N' || antwort == 'n') {
                weitermachen = false;
            }

        }

        //Wenn Programm beendet wird print "Adieu
        System.out.println("Adieu!");
    }
}

/*
Made by Rayan Lee Bopp
*/
