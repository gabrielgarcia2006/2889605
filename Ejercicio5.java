package es.ieslosalbares;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un valor para la base: ");
        double base = sc.nextDouble();
        System.out.print("Introduce un valor para la altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es " + area);
    }
}
