import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        int perhour;
        perhour=12;
        int horas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las horas que has trabajado: ");
        horas = sc.nextInt();
        System.out.printf("El sueldo correspondiente, sabiendo que por hora son 12 euros es de: "  + (perhour*horas)+  " euros\n");
    sc.close();
    }
}
