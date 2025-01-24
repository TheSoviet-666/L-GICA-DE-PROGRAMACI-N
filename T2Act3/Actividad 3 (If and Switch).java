public class Main {
    // 1. Calculadora de Calificaciones Finales
    import java.util.Scanner;

public class CalculadoraCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la calificación de parciales (0-100): ");
        double parciales = scanner.nextDouble();
        System.out.print("Ingresa la calificación del proyecto (0-100): ");
        double proyecto = scanner.nextDouble();
        System.out.print("Ingresa la calificación del examen final (0-100): ");
        double examenFinal = scanner.nextDouble();

        if (parciales >= 0 && parciales <= 100 && proyecto >= 0 && proyecto <= 100 && examenFinal >= 0 && examenFinal <= 100) {
            double notaFinal = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);
            System.out.println("La calificación final es: " + notaFinal);
        } else {
            System.out.println("Por favor, ingresa calificaciones válidas entre 0 y 100.");
        }
        scanner.close();
    }
}

// 2. Verificar edad para votar
import java.util.Scanner;

public class VerificarEdadVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres elegible para votar.");
        } else {
            System.out.println("No eres elegible para votar.");
        }
        scanner.close();
    }
}

// 3. Evaluación de Calificaciones con Letras
import java.util.Scanner;

public class EvaluacionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la calificación numérica (0-100): ");
        int calificacion = scanner.nextInt();

        if (calificacion >= 90) {
            System.out.println("Calificación: A");
        } else if (calificacion >= 80) {
            System.out.println("Calificación: B");
        } else if (calificacion >= 70) {
            System.out.println("Calificación: C");
        } else if (calificacion >= 60) {
            System.out.println("Calificación: D");
        } else {
            System.out.println("Calificación: F");
        }
        scanner.close();
    }
}

// 4. Calcular Precio con Descuento
import java.util.Scanner;

public class CalcularDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: ");
        double precio = scanner.nextDouble();
        double precioFinal;

        if (precio <= 100) {
            precioFinal = precio;
        } else if (precio <= 200) {
            precioFinal = precio * 0.9;
        } else if (precio <= 500) {
            precioFinal = precio * 0.8;
        } else {
            precioFinal = precio * 0.75;
        }

        System.out.println("El precio final con descuento es: " + precioFinal);
        scanner.close();
    }
}

// 5. Determinar la estación del año
import java.util.Scanner;

public class EstacionDelAnio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número de mes (1-12): ");
        int mes = scanner.nextInt();

        String estacion;
        switch (mes) {
            case 12: case 1: case 2:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido";
        }
        System.out.println("La estación del año es: " + estacion);
        scanner.close();
    }
}

// 6. Convertidor de grados
import java.util.Scanner;

public class ConvertidorGrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Selecciona la conversión: \n1. Fahrenheit \n2. Kelvin");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                double fahrenheit = celsius * 9/5 + 32;
                System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
                break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.println("La temperatura en Kelvin es: " + kelvin);
                break;
            default:
                System.out.println("Opción inválida.");
        }
        scanner.close();
    }
}

// 7. Conversor de monedas
import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en pesos mexicanos: ");
        double pesos = scanner.nextDouble();

        System.out.println("Selecciona la moneda: \n1. USD \n2. EUR \n3. THB \n4. JPY \n5. KRW \n6. AUD \n7. PEN \n8. CAD \n9. VES \n10. ARS");
        int opcion = scanner.nextInt();

        double conversion = 0;
        switch (opcion) {
            case 1: conversion = pesos * 0.056; break; // Dólar
            case 2: conversion = pesos * 0.048; break; // Euro
            case 3: conversion = pesos * 1.87; break; // Bath
            case 4: conversion = pesos * 7.65; break; // Yen
            case 5: conversion = pesos * 74.42; break; // Won
            case 6: conversion = pesos * 0.086; break; // Dólar Australiano
            case 7: conversion = pesos * 0.21; break; // Sol
            case 8: conversion = pesos * 0.076; break; // Dólar Canadiense
            case 9: conversion = pesos * 1.77; break; // Bolívar
            case 10: conversion = pesos * 19.4; break; // Peso Argentino
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("La cantidad convertida es: " + conversion);
        scanner.close();
    }
}

// 8. Brindar información
import java.util.Scanner;

public class InformacionArtista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una opción para obtener información: \n1. Artista \n2. Película \n3. Serie \n4. Libro \n5. Canción");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Artista: Kurt Cobain - Vocalista .");
                break;
            case 2:
                System.out.println("Película: Inception - Película de ciencia ficción dirigida por Christopher Nolan.");
                break;
            case 3:
                System.out.println("Serie: Breaking Bad - Serie sobre un maestro de química convertido en narcotraficante.");
                break;
            case 4:
                System.out.println("Libro: Cien años de soledad - Escrito por Gabriel García Márquez.");
                break;
            case 5:
                System.out.println("Canción: Imagine - Canción icónica de John Lennon.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
        scanner.close();
    }
}

    
}
