import java.util.Scanner;
public class Main {
    



    public static boolean esPalindromo(String texto) {
        String textoInverso = new StringBuilder(texto).reverse().toString();
        return texto.equals(textoInverso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

   
        if (esPalindromo(texto)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}


