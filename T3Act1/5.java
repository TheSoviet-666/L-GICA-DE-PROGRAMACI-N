import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        double raiz = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }
}
