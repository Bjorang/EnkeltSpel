
package ranArb;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int x = Metoder.randomTall();
        int y;

        do {
            y = new Scanner(System.in).nextInt();

            System.out.println(y > x? "mindre": y<x? "Större": "RÄtt");
        }
            while (x != y);
        
        
    }

    
}
