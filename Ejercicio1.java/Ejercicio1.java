import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor introduza un valor ");
        int n = sc.nextInt();
        System.out.print("Por favor, introduza otro valor ");
        int x = sc.nextInt(); 
        System.out.printf("%d * (%(d)=%d", n,x, n*x);
        sc.close();
    }
} 