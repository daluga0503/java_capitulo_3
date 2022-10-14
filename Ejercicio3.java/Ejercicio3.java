import java.util.Scanner;
public class Ejercicio3 {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime cuantas pesetas quieres convertir en euros:  ");
        float pesetas = sc.nextFloat();
        double euros = 1/166.368;
        System.out.print(pesetas + " son " + (int)(euros*pesetas) + " euros");
        sc.close();
}
    }