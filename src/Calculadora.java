import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que elija la operación
        System.out.println("Elija la operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        int opcion = scanner.nextInt();

        // Pedir al usuario los dos números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        OperacionMatematica operacion = null;

        // Crear la operación seleccionada
        switch (opcion) {
            case 1:
                operacion = new Suma(numero1, numero2);
                break;
            case 2:
                operacion = new Resta(numero1, numero2);
                break;
            case 3:
                operacion = new Multiplicacion(numero1, numero2);
                break;
            case 4:
                operacion = new Division(numero1, numero2);
                break;
            case 5:
                operacion = new Potencia(numero1, numero2);
                break;
            default:
                System.out.println("Opción inválida");
                return; // Termina el programa si la opción es inválida
        }

        // Realizar la operación y mostrar el resultado
        operacion.realizarOperacion();
        System.out.println("El resultado de la operación es: " + operacion.getResultado());
    }
}