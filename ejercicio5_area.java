public class ejercicio5_area {
    public static double calcularArea(String poligono, double... dimensiones) {
        switch (poligono.toLowerCase()) {
            case "triangulo":
                if (dimensiones.length != 2) 
                    throw new IllegalArgumentException("El triángulo requiere base y altura");
                return (dimensiones[0] * dimensiones[1]) / 2;
            
            case "cuadrado":
                if (dimensiones.length != 1) 
                    throw new IllegalArgumentException("El cuadrado requiere un lado");
                return dimensiones[0] * dimensiones[0];
            
            case "rectangulo":
                if (dimensiones.length != 2) 
                    throw new IllegalArgumentException("El rectángulo requiere base y altura");
                return dimensiones[0] * dimensiones[1];
            
            default:
                throw new IllegalArgumentException("Polígono no soportado");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Área del triángulo: " + calcularArea("triangulo", 5, 4)); // 10.0
        System.out.println("Área del cuadrado: " + calcularArea("cuadrado", 3)); // 9.0
        System.out.println("Área del rectángulo: " + calcularArea("rectangulo", 4, 6)); // 24.0
    }
}
