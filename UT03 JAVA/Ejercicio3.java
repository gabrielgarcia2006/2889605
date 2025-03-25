import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A. Calcular área");
        System.out.println("B. Calcular base");
        System.out.println("C. Calcular altura");
        System.out.print("Elige una opción: ");
        char opcion = sc.next().toUpperCase().charAt(0);

        switch (opcion) {
            case 'A':
                System.out.print("Introduce la base: ");
                double base = sc.nextDouble();
                System.out.print("Introduce la altura: ");
                double altura = sc.nextDouble();
                double area = (base * altura) / 2;
                System.out.println("El área es: " + area);
                break;
            case 'B':
                System.out.print("Introduce la altura: ");
                double h = sc.nextDouble();
                System.out.print("Introduce el área: ");
                double a = sc.nextDouble();
                double b = (2 * a) / h;
                System.out.println("La base es: " + b);
                break;
            case 'C':
                System.out.print("Introduce la base: ");
                double b2 = sc.nextDouble();
                System.out.print("Introduce el área: ");
                double a2 = sc.nextDouble();
                double h2 = (2 * a2) / b2;
                System.out.println("La altura es: " + h2);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
