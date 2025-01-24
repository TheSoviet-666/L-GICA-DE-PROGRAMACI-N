// Programa 6: Adivinar el número
import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int intento;

        System.out.println("Adivina el número entre 1 y 100");
        do {
            System.out.print("Ingresa tu suposición: ");
            intento = scanner.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("Demasiado bajo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("Demasiado alto.");
            }
        } while (intento != numeroAleatorio);

        System.out.println("¡Felicidades! Adivinaste el número.");
    }
}
