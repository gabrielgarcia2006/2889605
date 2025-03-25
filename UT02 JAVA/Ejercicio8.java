import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce valor para el lado A: ");
        int a = sc.nextInt();
        System.out.print("Introduce valor para el lado B: ");
        int b = sc.nextInt();
        System.out.print("Introduce valor para el lado C: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Esos valores son los de un triángulo equilátero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Esos valores son los de un triángulo isósceles.");
        } else {
            System.out.println("Esos valores son los de un triángulo escaleno.");
        }
    }
}
