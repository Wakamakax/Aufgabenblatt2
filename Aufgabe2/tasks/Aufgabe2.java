/*
    Aufgabe2) Eingabe (Scanner)

    Erweitern Sie die main-Methode so, dass wiederholt Werte eingelesen werden,
    bis die Zahl 0 eingegeben wird. Dann wird das Programm beendet. Zuvor wird
    noch der Durchschnittswert aller eingelesenen Zahlen als ganzzahliger Wert
    ausgegeben (Nachkommastellen gehen verloren),  falls alle eingelesenen Werte
    ganze Zahlen waren. In allen anderen Fällen wird nichts ausgegeben.

    Zusatzfragen:
    1. Warum muss eine ungültige Eingabe (keine ganze Zahl) aus dem
    Input-Stream entfernt werden?
    2. Woran kann man erkennen, dass ein eingelesener Wert eine ganze Zahl ist?
    3. Woran kann man feststellen, ob eine frühere Eingabe ungültig war?
*/
import java.util.Scanner;
public class Aufgabe2{

    public static void main(String[] args) {
        // TODO: Implementieren Sie hier die Angabe

        Scanner scanner = new Scanner(System.in);
        float durchschnitt = 0;
        int sum = 0;

        int i =-1;
        int j = 0;

        while(scanner.hasNextInt() && i != 0) {

            i = scanner.nextInt();
            sum = (sum + i);
            j++;

        }

        durchschnitt = sum / j;
        System.out.println(durchschnitt);

    }
}

