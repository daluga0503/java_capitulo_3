import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Double base;

        System.out.println("Introduzca la base imponible de la factura");
        Scanner sc = new Scanner(System.in);
        base = sc.nextDouble;
        System.out.println("EL precio de la factura es = ", + base*1.21);
        sc.close();
    }
}