// Programa 11: Generar secuencia de cuadrados
import java.util.Scanner;

public class SecuenciaCuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int num = scanner.nextInt();

        int i = 1;
        do {
            System.out.println("El cuadrado de " + i + " es " + (i * i));
            i++;
        } while (i <= num);
    }
}
