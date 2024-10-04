/**
 * ejercicio1_fizzBuzz
 */
import java.util.Scanner;
public class ejercicio1_fizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeroMax=100;
        for (int i = 1; i <= numeroMax; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("fizzbuzz");
            }else if (i%3==0) {
                System.out.println("fizz");
            }else if (i%5==0) {
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    
}