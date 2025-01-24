// Programa 8: Calcular la media de números positivos
import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0, contador = 0;
        int num;

        System.out.println("Ingresa números positivos (un número negativo para terminar):");
        while ((num = scanner.nextInt()) >= 0) {
            suma += num;
            contador++;
        }

        if (contador > 0) {
            System.out.println("La media es: " + (double) suma / contador);
        } else {
            System.out.println("No ingresaste números positivos.");
        }
    }
}
