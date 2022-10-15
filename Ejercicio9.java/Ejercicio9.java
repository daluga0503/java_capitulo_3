import java.util.Scanner;
import java.math.*;

public class Ejercicio9 {
    public static void main(String[] args){
        Double diametro, radio, altura;
        Scanner sc = new Scanner(System.in);
        System.out.printf("La fórmula para realizar el volumen del cono es la siguiente:" + "(1/3)*π10*r^2*h\n");
        System.out.println("Dime el diámetro del cono del que quieres relizar el volumen: ");
        diametro=sc.nextDouble();
        radio=diametro/2;
        System.out.println("Dime la altura del cono: ");
        altura=sc.nextDouble();
        System.out.println("El volumen del cono es de: " + (1/3)*(Math.PI*radio*radio*altura));
        sc.close();
    }
}
