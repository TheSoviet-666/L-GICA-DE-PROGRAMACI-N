
    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String palabra;
        System.out.println("Ingresa palabras (termina con espacio en blanco):");


        while (true) {
            palabra = scanner.nextLine();

            if (palabra.trim().isEmpty()) {
                break; 
            }

            System.out.println(palabra.toUpperCase()); 
        }
    }
}


