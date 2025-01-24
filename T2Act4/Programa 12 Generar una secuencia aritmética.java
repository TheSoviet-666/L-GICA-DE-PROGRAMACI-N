// Programa 12: Generar una secuencia aritmética
import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número de la secuencia: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingresa la diferencia: ");
        int diferencia = scanner.nextInt();
        System.out.print("Ingresa el número máximo: ");
        int max = scanner.nextInt();

        int num = inicio;
        do {
            System.out.println(num);
            num += diferencia;
        } while (num <= max);
    }
}
