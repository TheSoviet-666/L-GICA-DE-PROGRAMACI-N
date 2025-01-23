import java.util.Scanner;

public class Main {
    


    // Función para calcular el MCD
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario dos números enteros
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Calcular y mostrar el MCD
        int mcd = calcularMCD(num1, num2);
        System.out.println("El Máximo Común Divisor es: " + mcd);
    }
}

