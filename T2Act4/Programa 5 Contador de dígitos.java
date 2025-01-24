// Programa 5: Contador de dígitos
import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int num = scanner.nextInt();

        int digitos = String.valueOf(Math.abs(num)).length();
        System.out.println("El número tiene " + digitos + " dígitos.");
    }
}
