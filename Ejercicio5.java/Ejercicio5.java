public class Ejercicio5 {
    public stiatic void main {
        double base;
        double altura;
        System.out.println("Dime la altura del rectángulo para realizar el área");
        altura = Double.parseDouble(System.console().readLine());
        System.out.println("Ahora, introduzca la altura del rectángulo");
        base = Double.parseDouble(System.console().readLine());
        System.out.println("EL resultado del área del rectángulo es de: ", + (altura*base));

    }
}