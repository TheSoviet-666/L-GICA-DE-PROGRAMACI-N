import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.print("Ingresa el carácter a reemplazar: ");
        char viejo = scanner.next().charAt(0);
        System.out.print("Ingresa el nuevo carácter: ");
        char nuevo = scanner.next().charAt(0);

        String nuevoTexto = texto.replace(viejo, nuevo);
        System.out.println("Texto modificado: " + nuevoTexto);
    }
}

