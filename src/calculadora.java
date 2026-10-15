import java.util.Scanner;

public class calculadora {
    public static double sumar (double a, double b) {
        return a + b;
    }

    public static double restar (double a , double b) {
        return a - b; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double b = scanner.nextDouble();

        System.out.println("Suma: " + sumar(a, b)); 
        System.out.println("Resta: " + restar(a, b));

        scanner.close();
    }
}