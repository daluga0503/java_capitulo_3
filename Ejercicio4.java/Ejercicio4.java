
public class Ejercicio4 {
    public static void main(String[] args) {
    double v1;
    double v2;
    String linea;
    System.out.print("Por favor, introduzca el primer número: ");
    linea = System.console().readLine();
    v1 = Double.parseDouble(linea);
    System.out.print("Introduzca el segundo número: ");
    linea = System.console().readLine();
    v2 = Double.parseDouble(linea);
    System.out.println("v1 = " + v1);
    System.out.println("v2 = " + v2);
    System.out.println("v1 + v2 = " + (v1 + v2)); 
    System.out.println("v1 - v2 = " + (v1 - v2));
    System.out.println("v1 * v2 = " + (v1 * v2));
    System.out.println(" v1/ v2 = " + (v1 / v2));
    }
}