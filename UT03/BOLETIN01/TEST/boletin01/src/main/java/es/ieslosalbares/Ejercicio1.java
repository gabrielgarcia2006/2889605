package es.ieslosalbares;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El número mayor es " + num1);
        } else {
            System.out.println("El número mayor es " + num2);
        }
    }
}
