import java.util.Arrays;

public class ejercicio2_anagrama {
    public static boolean esAnagrama(String palabra1, String palabra2) {
        if (palabra1.equalsIgnoreCase(palabra2)) {
            return false;
        }
                palabra1 = palabra1.toLowerCase().replaceAll("\\s", "");
        palabra2 = palabra2.toLowerCase().replaceAll("\\s", "");
        

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] arregloPalabra1 = palabra1.toCharArray();
        char[] arregloPalabra2 = palabra2.toCharArray();

        Arrays.sort(arregloPalabra1);
        Arrays.sort(arregloPalabra2);
        
        return Arrays.equals(arregloPalabra1, arregloPalabra2);
    }
    

    public static void main(String[] args) {
        System.out.println(esAnagrama("Amor", "Roma")); // true
        System.out.println(esAnagrama("Hola", "Hola")); // false
        System.out.println(esAnagrama("Listen", "Silent")); // true
    }
}

