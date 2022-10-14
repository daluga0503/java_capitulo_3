public class Ejercicio6 {
    public static void main(String[] args){
        double base;
        double altura;
        System.out.println("Dime la altura del rectángulo para realizar el área");
        base = Double.parseDouble(System.console().readLine());
        System.out.println("Ahora, introduzca la altura del rectángulo");
        altura = Double.parseDouble(System.console().readLine());
        System.out.println("EL resultado del área del rectángulo es de: ", + (altura*base)/2);
    }
}