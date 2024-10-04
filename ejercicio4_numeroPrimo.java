/**
 * ejercicio4_numeroPrimo
 */
import java.util.Scanner;
import java.util.Random;
public class ejercicio4_numeroPrimo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random aleatorio=new Random(System.currentTimeMillis());
        System.out.println("Ingrese un numero entero");
        int numeroPrueba=5;
        int numeroUsuario=sc.nextInt();
        int pruebaPrimo=(numeroPrueba^numeroUsuario)-numeroPrueba;
        if (pruebaPrimo%numeroUsuario==0) {
            System.out.println(numeroUsuario+" Es primo");
        }else{
            System.out.println(numeroUsuario+" No es primo");
        }
        
    }
}     