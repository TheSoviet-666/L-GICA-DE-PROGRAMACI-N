// Programa 9: Calculadora básica con menú
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Calculadora:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + (num1 + num2));
                    case 2 -> System.out.println("Resultado: " + (num1 - num2));
                    case 3 -> System.out.println("Resultado: " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("No se puede dividir entre cero.");
                        }
                    }
                }
            } else if (opcion != 5) {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        System.out.println("Programa finalizado.");
    }
}
