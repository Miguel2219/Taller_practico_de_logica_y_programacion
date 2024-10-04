import java.util.Scanner;
public class ejercicio3_fibonacci
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros de la secuencia de fibonacci");
        int cantidad=sc.nextInt();
        int numero=0;
        int num1=0;
        int num2=1;
        System.out.println("La secuencia de fibonacci es: ");
        System.out.println(num1);
        System.out.println(num2);
        for (int i=2;i<cantidad ;i++ ){
            numero=(num1+num2);
            System.out.println(numero);
            num1=num2; 
            num2=numero;
        }
        
        
    }
}
