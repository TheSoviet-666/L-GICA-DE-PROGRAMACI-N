// Programa 10: Contador de números impares
import java.util.Scanner;

public class ContadorImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int num = scanner.nextInt();

        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= num);
    }
}
