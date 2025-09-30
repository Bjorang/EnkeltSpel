
package ranArb;

import java.net.Socket;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String spelaIgen;

        do {
            int x = Metoder.randomTall();
            int y;
            int antalGissningar = 0;
            System.out.println(" --- Nytt spel startat ---");
            System.out.println("Skriv in en siffra mellan 1 och 100");
            do {
                if (scanner.hasNextInt()) {
                    y = scanner.nextInt();
                    antalGissningar++;

                    System.out.println(y > x ? "mindre, testa en gång till"
                            : y < x ? "Större, testa en gång till" : "Rätt bra jobbat.");
                } else {
                    System.out.println("Ogiltig inmatning, skriv in ett heltal.");
                    scanner.next();
                    y = -1;
                    continue;
                }
            } while (x != y);

            System.out.println("Du gissade rätt på " + antalGissningar + " försök.");

            System.out.println("Vill du spela en gång till? Ja/Nej");
            scanner.nextLine();
            spelaIgen = scanner.nextLine();
        } while (spelaIgen.equalsIgnoreCase("Ja"));
        System.out.println("Tack för att du spelade");
        scanner.close();
    }
}
