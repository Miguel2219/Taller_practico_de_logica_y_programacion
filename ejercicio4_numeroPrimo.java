//El ejercicio lo hice con ayuda de IA, no supe coger la logica
import java.util.Scanner;
public class ejercicio4_numeroPrimo {
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimosHasta100() {
        System.out.println("Números primos entre 1 y 100:");
        for (int num = 1; num <= 100; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para verificar si es primo: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        PrimosHasta100();
        scanner.close();
    }
}