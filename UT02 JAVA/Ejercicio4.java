import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número A: ");
        int a = sc.nextInt();
        System.out.print("Introduce número B: ");
        int b = sc.nextInt();
        System.out.print("Introduce número C: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A es el mayor.");
        } else if (b >= a && b >= c) {
            System.out.println("B es el mayor.");
        } else {
            System.out.println("C es el mayor.");
        }
    }
}
