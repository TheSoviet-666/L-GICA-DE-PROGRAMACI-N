// Programa 3: Contar letras 'a' en una palabra
import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        int contador = 0;
        for (char c : palabra.toCharArray()) {
            if (c == 'a' || c == 'A') contador++;
        }

        System.out.println("La letra 'a' aparece " + contador + " veces.");
    }
}
