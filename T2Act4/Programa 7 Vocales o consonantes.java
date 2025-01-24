// Programa 7: Vocales o consonantes
import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        do {
            System.out.print("Ingresa una letra (espacio para salir): ");
            letra = scanner.next().charAt(0);

            if (letra == ' ') break;

            if ("aeiouAEIOU".indexOf(letra) != -1) {
                System.out.println("Es una vocal.");
            } else {
                System.out.println("Es una consonante.");
            }
        } while (true);

        System.out.println("Programa finalizado.");
    }
}
