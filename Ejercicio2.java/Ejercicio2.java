import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime cuantos euros quieres convertir en pesetas:  ");
        float euros= sc.nextFloat();
        float pesetas = 166.386f;
        System.out.print(euros + " son " + (int)(euros*pesetas) + " pesetas");
        sc.close();
}
}