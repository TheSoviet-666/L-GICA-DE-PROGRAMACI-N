// Programa 2: Conteo de números
import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = scanner.nextInt();

        int mayores = 0, menores = 0, iguales = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa un número: ");
            int num = scanner.nextInt();

            if (num > 0) mayores++;
            else if (num < 0) menores++;
            else iguales++;
        }

        System.out.println("Mayores a 0: " + mayores);
        System.out.println("Menores a 0: " + menores);
        System.out.println("Iguales a 0: " + iguales);
    }
}

