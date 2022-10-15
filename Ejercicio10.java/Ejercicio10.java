import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Double Mb;
        Scanner sc = new Scnner(System.in);
        System.out.println("Dime cuantos Mb quieres convertir a Kb");
        Mb=sc.nextDouble(System.in);
        System.out.println("La conversion es de: " + Mb*1024 + " Kb");
        sc.close();
    }
}
